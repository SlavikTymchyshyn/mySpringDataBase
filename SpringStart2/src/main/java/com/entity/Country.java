package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@NamedQueries({@NamedQuery(name = Country.FIND_ALL, query="select c from Country c")})
@Entity
public class Country {
	
	public static final String FIND_ALL="findAll";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "country_name")
	private String nameCountry;
	
	@OneToMany(cascade =CascadeType.ALL, fetch= FetchType.LAZY,mappedBy="country")
	private List<Location> locations;
	
	public Country(){}
	public Country(String name){
		this.nameCountry=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", nameCountry=" + nameCountry + "]";
	}
	
	
	
	
	
	

}
