package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Adress;

@Repository
public interface AdressRepository extends CrudRepository<Adress, Integer>{
//	Adress findOneByNameAdress(String nameAdress);
	
	Adress findByNameAdress(String nameAdress);//де ліст а де один писати в залежності від класу типу звязку
	
	//List<Adress> findByNameAdress(String nameAdress);
}
