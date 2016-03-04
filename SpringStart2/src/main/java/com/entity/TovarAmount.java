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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Tovar_Amount")
public class TovarAmount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
//	@OneToOne  - ����� ����� �� ������ � ������(cascade=CascadeType.ALL ���� �� ������������)
// � �i� ������� ���� �������� � ������ (mappedBy = "tovar") ����� �������� �� ��� ���� �� ���� ��������
	//tovarAmount �� ���� ���� ��� tovar, ��� � ���������� �� �� �� ��������
	@ManyToOne
	private Tovar tovar;
	
	@Column(name="amount")
	private int amount;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="buy_tovarAmount",joinColumns=
	@JoinColumn(name="fk_tovarAmount"),inverseJoinColumns = 
	@JoinColumn(name = "fk_buy"))
	private List<Buy> buys;

	public TovarAmount(){}; // �� ����� ��� ����� ������ �� ���� ���� � �����
	public TovarAmount(int amount){
		this.amount=amount;
		
//		if(this.tovar.getAmountSklad()>0){
//			this.tovar.setAmountSklad(this.tovar.getAmountSklad()-this.amount);
//			if(this.tovar.getAmountSklad()<0){
//				throw new NullPointerException("error: there are no such kind of item");
//			}
//		}else{throw new NullPointerException("error: there are no such kind of item");}
	} 
	
	public void amountSklad(int amount,Tovar t){
		this.amount=amount;
		if(t.getAmountSklad()>0){
			t.setAmountSklad(t.getAmountSklad()-this.amount);
			if(t.getAmountSklad()<0){
				throw new NullPointerException("error: there are no such kind of item");
			}
		}else{throw new NullPointerException("error: there are no such kind of itemS");}
	}
	
	public Tovar getTovar() {
		return tovar;
	}

	public void setTovar(Tovar tovar) {
		this.tovar = tovar;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public List<Buy> getBuys() {
		return buys;
	}

	public void setBuys(List<Buy> buys) {
		this.buys = buys;
	}
	@Override
	public String toString() {
		return "TovarAmount [id=" + id + ", tovar=" + tovar + ", amount="
				+ amount + "]";
	}
	
	
}
