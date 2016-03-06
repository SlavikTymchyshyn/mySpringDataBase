package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Family {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="surname")
	private String surname;
	
	@OneToMany(cascade =CascadeType.ALL, fetch= FetchType.LAZY,mappedBy="family")
	private List<Customer> customers;//�������� �� ��� ����	(��� ��� ���������� �� ��� ������ ������ ���� � ���������� ���������)

	public Family(){}
	public Family(String name){
		this.surname=name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	@Override
	public String toString() {
		return "Family [id=" + id + ", surname=" + surname + "]";
	}
	
	

}
