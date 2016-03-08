package com.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.entity.Adress;

public interface AdressRepository extends CrudRepository<Adress, Integer>{
//	Adress findOneByNameAdress(String nameAdress);
	
	Adress findByNameAdress(String nameAdress);//де ліст а де один писати в залежності від класу типу звязку
		
	void insertAdress(String nameAdress);
	
	List<Adress> findAll();
	
	
	//List<Adress> findByNameAdress(String nameAdress);
}
