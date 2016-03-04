package com.entity;

import java.util.List;

import javax.persistence.*;


@Entity
public class Tovar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Category category;
	
	@ManyToOne
	private Manufacturer manufacturer;//ManyToOne - ������ �� ����� ������(�� �� ��� FK)
	
	@Column(name = "name_model")
	private String modelName;
	
	@Column(name = "detail", length=550)
	private String detail;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "amount_sklad")
	private int amountSklad;
		
	//@OneToOne(cascade=CascadeType.ALL, mappedBy="tovar")
	@OneToMany(cascade =CascadeType.ALL, fetch= FetchType.LAZY,mappedBy="tovar"/*targetEntity=TovarAmount.class*/)
	private List<TovarAmount> tovarAmounts;//���������� ������ �� ���� ����� ID(��� OneToMany)
	
	Tovar(){};
	Tovar(String model,double price,int amount){
		this.modelName=model;
		this.price=price;
		this.amountSklad=amount;
	};
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getAmountSklad() {
		return amountSklad;
	}
	public void setAmountSklad(int amountSklad) {
		this.amountSklad = amountSklad;
	}
	public List<TovarAmount> getTovarAmounts() {
		return tovarAmounts;
	}
	public void setTovarAmounts(List<TovarAmount> tovarAmounts) {
		this.tovarAmounts = tovarAmounts;
	}
	@Override
	public String toString() {
		return "Tovar [id=" + id + ", category=" + category + ", manufacturer="
				+ manufacturer + ", modelName=" + modelName + ", detail="
				+ detail + ", price=" + price + ", amountSklad=" + amountSklad
				+ "]";
	}

	

	
	

}
