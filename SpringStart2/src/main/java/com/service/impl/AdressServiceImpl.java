package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.Adress;
import com.repository.AdressRepository;
import com.service.AdressService;

public class AdressServiceImpl implements AdressService{

	@Autowired
    private AdressRepository adressRepository;
	
	@Override
	public Adress addAdress(Adress adress) {
		Adress savedAdress = adressRepository.save(adress);
	    return savedAdress;
	}

	@Override
	public void delete(int id) {
		adressRepository.delete(id);
	}

	@Override
	public Adress getByNameAdress(String name) {
		return adressRepository.findByNameAdress(name);
	}

	@Override
	public Adress editAdress(Adress adress) {
		return adressRepository.save(adress);
	}

	@Override
	public List<Adress> getAll() {
		return (List<Adress>) adressRepository.findAll();  //treba???????
	}

}
