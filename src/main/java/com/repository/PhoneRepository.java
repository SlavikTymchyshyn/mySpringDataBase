package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Phone;

@Repository
public interface PhoneRepository extends CrudRepository<Phone, Integer>{
	Phone findByName(String name);
}
