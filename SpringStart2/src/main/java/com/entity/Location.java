package com.entity;

import java.util.ArrayList;
import java.util.LinkedList;
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
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="location_site",joinColumns=
	@JoinColumn(name="fk_location"),inverseJoinColumns = 
	@JoinColumn(name = "fk_site"))	
	private List<Site> sites;
				
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="manufacturer_location",joinColumns=
	@JoinColumn(name="fk_location"),inverseJoinColumns = 
	@JoinColumn(name = "fk_manufacturer"))	
	private List<Manufacturer> manufacturers;//�������-��������� �� manufacturers(ManyToMany)

	public List<Phone> createListPhone(){
		this.phones=new LinkedList<>();
		return this.phones;
	}
	public List<Site> createListSite(){
		this.sites=new LinkedList<>();
		return this.sites;
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

	

	public List<Site> getSites() {
		return sites;
	}

	public void setSites(List<Site> sites) {
		this.sites = sites;
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
				+ adress + "]";
	}
	
	
	
	
}
