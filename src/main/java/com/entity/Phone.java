package com.entity;

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

@Entity
public class Phone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "phone_number")
	private String name;
//CascadeType.ALL - �� ��� �������� ������� ������ �� ���������, ��� �������� ���� ��������� � ��� ��������� �������.
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY) 	//fetch-����������,-LAZY ������ �� ���� ������
	@JoinTable(name="location_phone",joinColumns=				//�������������� ���� ��� ����� ����� ���� ��������� get
	@JoinColumn(name="fk_phone"),inverseJoinColumns = 
	@JoinColumn(name = "fk_location"))							 
	private List<Location> locations;					

	public Phone(){};
	public Phone(String name){
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
	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", namePhone=" + name + "]";
	}


	
	
	
	
}
