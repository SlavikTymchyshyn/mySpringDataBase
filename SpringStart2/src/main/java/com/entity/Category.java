package com.entity;

import java.util.List;

import javax.persistence.*;


@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "category_name")
	private String name;
	
	@OneToMany(cascade =CascadeType.ALL, fetch= FetchType.LAZY,mappedBy="category")
	private List<Tovar> tovars;//��������� �� ���� ����� ID

	public Category(){};
	public Category(String name){
		this.name=name;
	}
	
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

	public List<Tovar> getTovars() {
		return tovars;
	}

	public void setTovars(List<Tovar> tovars) {
		this.tovars = tovars;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
