package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	private Family family;

	@ManyToOne
	private Named named;

	@Column(name = "mail")
	private String mailName;

	@Column(name = "password")
	private String pass;

	@Enumerated(EnumType.STRING)	//����� EnumType.ORDINAL ��� �� ���� �������� ��������� ������� ��� ������ �������
	private Sex sex;
	@Enumerated(EnumType.STRING)
	private Role role;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
	private List<Buy> buys;// �������� ������ �� Buy(ManyToMany)

	public Customer() {
	};

	public Customer(String mail, String password) {
//		if (mail.equals("sleshnfs@mail.ru") && password.equals("123456")) {
//			this.mailName = mail;
//			this.pass = password;
//			this.role = Role.ADMIN;
//		} else if (mail.length() > 0 && password.length() > 0) {
//			this.mailName = mail;
//			this.pass = password;
//			this.role = Role.USER;
//		} else if (mail.isEmpty() || password.isEmpty()) {
//			this.role = Role.GUEST;
//		} else {
//			this.role = Role.GUEST;
//		}
		
		switch (mail) {
		case "":
			this.role = Role.GUEST;
			break;
		case "sleshnfs@mail.ru": {
			if(password.equals("123456")){
				this.role=Role.ADMIN;
				this.mailName = mail;
				this.pass = password;
			}else{this.role=Role.GUEST;}
			break;
		}
		default:{
			if(password.length()>0&&mail.length()>0){
					this.mailName = mail;
					this.pass = password;
					this.role=Role.USER;
				}else{this.role=Role.GUEST;}
			break;
			}
		}
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}


	public String getMailName() {
		return mailName;
	}

	public void setMailName(String mailName) {
		this.mailName = mailName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public Named getNamed() {
		return named;
	}

	public void setNamed(Named named) {
		this.named = named;
	}

	public List<Buy> getBuys() {
		return buys;
	}

	public void setBuys(List<Buy> buys) {
		this.buys = buys;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", family=" + family + ", named=" + named
				+ ", mailName=" + mailName + ", pass=" + pass + ", sex=" + sex
				+ ", role=" + role + "]";
	}

		
}
