package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Location {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Country country;
	
	@ManyToOne
	private Adress adress;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="location_phone",joinColumns=
	@JoinColumn(name="fk_location"),inverseJoinColumns = 
	@JoinColumn(name = "fk_phone"))	
	private List<Phone> phones;
	
	@ManyToOne
	private Site site;
				
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="manufacturer_location",joinColumns=
	@JoinColumn(name="fk_location"),inverseJoinColumns = 
	@JoinColumn(name = "fk_manufacturer"))	
	private List<Manufacturer> manufacturers;//�������-��������� �� manufacturers(ManyToMany)

	public List<Phone> createList(){
		this.phones=new ArrayList<>();
		return this.phones;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}


	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<Manufacturer> getManufacturers() {
		return manufacturers;
	}

	public void setManufacturers(List<Manufacturer> manufacturers) {
		this.manufacturers = manufacturers;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", country=" + country + ", adress="
				+ adress + ", site=" + site + "]";
	}
	
	
	
	
}
