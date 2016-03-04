package com.entity;

public enum Role {

	USER,ADMIN,GUEST;
	
	@Override
	public String toString() {
		return "RoleTYPE [id=" + ordinal() + ", Role - " + name() + "]";
	}
}
