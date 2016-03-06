package com.entity;

public enum Role {

	USER,ADMIN,GUEST;
	
	Role(){
		
	}
	@Override
	public String toString() {
		return "RoleTYPE [id=" + ordinal() + ", Role - " + name() + "]";
	}
}
