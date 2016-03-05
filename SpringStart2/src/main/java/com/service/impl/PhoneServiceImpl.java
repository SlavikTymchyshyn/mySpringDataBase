package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Adress;
import com.entity.Phone;
import com.repository.PhoneRepository;
import com.service.PhoneService;

public class PhoneServiceImpl implements PhoneService{
	
	@Autowired
    private	PhoneRepository phoneRepository;
	
	@Override
	public Phone addPhone(String name) {
		Phone savedPhone=new Phone(name);
		phoneRepository.save(savedPhone);
	    return savedPhone;
	}

	@Override
	public void delete(int id) {
		phoneRepository.delete(id);
	}

	@Override
	public Phone getByNamePhone(String name) {
		return phoneRepository.findByNamePhone(name);	
	}

	@Override
	public Phone editPhone(String name) {
		Phone savedPhone=new Phone(name);
		if(savedPhone.getId()==0) 
		return phoneRepository.save(savedPhone);
		else{
			phoneRepository.save(savedPhone);
		}
		return savedPhone;
	}

	@Override
	@Transactional
	public Iterable<Phone> getAll() {
		return phoneRepository.findAll();
	}

}
