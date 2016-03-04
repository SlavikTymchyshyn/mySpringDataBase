package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Manufacturer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "manufacture_name")
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="manufacturer_location",joinColumns=
	@JoinColumn(name="fk_manufacturer"),inverseJoinColumns = 
	@JoinColumn(name = "fk_location"))	
	private List<Location> locations;//FK-cc���� ���om
	
	@OneToMany(cascade =CascadeType.ALL, fetch= FetchType.LAZY,mappedBy="manufacturer")
	private List<Tovar> tovars;//�������-��������� (ManyToMany)

	public Manufacturer(){};
	
	public Manufacturer(String name){
		this.name=name;
	};
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Location> getLocation() {
		return locations;
	}

	public void setLocation(List<Location> location) {
		this.locations = location;
	}

	public List<Tovar> getTovars() {
		return tovars;
	}

	public void setTovars(List<Tovar> tovars) {
		this.tovars = tovars;
	}

	@Override
	public String toString() {
		return "Manufacturer [id=" + id + ", name=" + name + "]";
	}

	
}
