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
public class Site {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//��������� ��� �������� ����� � �������� ��� ������ ���������� ������ � ���� (�� ����������� ��� ���� � ��� ��� �����)
	@Column(name = "site_name")// ������������ ��� �������� ��� ���� ����� ���������
	private String nameSite;
//	CascadeType.ALL - �������� ������ �� ������ � ��� � ���� ������ ����
	@OneToMany(cascade =CascadeType.ALL, fetch= FetchType.LAZY,mappedBy="site")
	private List<Location> locations;

	public Site(){};
	public Site(String name){
		this.nameSite=name;
	};
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameSite() {
		return nameSite;
	}

	public void setNameSite(String nameSite) {
		this.nameSite = nameSite;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	@Override
	public String toString() {
		return "Site [id=" + id + ", nameSite=" + nameSite + "]";
	}
	
	
}
