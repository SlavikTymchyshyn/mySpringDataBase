package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.entity.Phone;

public interface PhoneRepository extends CrudRepository<Phone, Integer>{
	List<Phone> findByNamePhone(String phone);
}
