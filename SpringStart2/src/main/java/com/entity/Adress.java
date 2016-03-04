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

@Entity
@NamedQueries({
	@NamedQuery(name = "Adress.getByName", query = "select a from Adress a where a.nameAdress=:name")})
public class Adress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "name_Adress")
	private String nameAdress;

	@OneToMany(cascade =CascadeType.ALL, fetch= FetchType.LAZY,mappedBy="adress")
	private List<Location> locations;

	public Adress(){};
	public Adress(String name){
		this.nameAdress=name;
	};
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameAdress() {
		return nameAdress;
	}

	public void setNameAdress(String nameAdress) {
		this.nameAdress = nameAdress;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	@Override
	public String toString() {
		return "Adress [id=" + id + ", nameAdress=" + nameAdress + "]";
	}
	
	
	
	
}
