package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.Family;

public interface FamilyRepository extends CrudRepository<Family, Integer>{
	
	Family findBySurname(String name);
	
}
