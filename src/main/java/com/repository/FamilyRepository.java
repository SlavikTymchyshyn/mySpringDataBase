package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Family;

@Repository
public interface FamilyRepository extends CrudRepository<Family, Integer>{
	
	Family findBySurname(String name);
	
}
