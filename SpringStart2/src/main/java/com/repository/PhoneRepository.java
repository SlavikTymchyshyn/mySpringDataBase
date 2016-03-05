package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.Phone;

public interface PhoneRepository extends CrudRepository<Phone, Integer>{
	Phone findByNamePhone(String phone);
}
