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
import javax.persistence.ManyToOne;

@Entity
public class Buy {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Customer customer;// �� ������ �� ��� ����
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="buy_tovarAmount",joinColumns=
	@JoinColumn(name="fk_buy"),inverseJoinColumns = 
	@JoinColumn(name = "fk_tovarAmount"))			//� ����� ������� 2 ������ ������ ��������
	private List<TovarAmount> tovarAmounts;// �� ������ �� ��� ����
	
	@Column (name = "data_buy")
	private String date;
	
	public Buy(){};
	public Buy(String data){
		this.date=data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public List<TovarAmount> getTovarAmounts() {
		return tovarAmounts;
	}
	public void setTovarAmounts(List<TovarAmount> tovarAmounts) {
		this.tovarAmounts = tovarAmounts;
	}
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Buy [id=" + id + ", customer=" + customer + ", date=" + date
				+ "]";
	}

	
	
	
	

}
