package com.entity;

public enum Sex {
	MALE,FEMALE;
	
	@Override
	public String toString() {
		return "sexTYPE [id=" + ordinal() + ", SEX - " + name() + "]";
	}
}
