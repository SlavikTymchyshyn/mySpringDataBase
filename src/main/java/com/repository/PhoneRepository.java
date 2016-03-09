package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.Phone;

public interface PhoneRepository extends CrudRepository<Phone, Integer>{
	Phone findByName(String name);
	void insertPhone(String name);
	void delete(String name);
}
