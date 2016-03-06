package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Adress;
import com.repository.AdressRepository;
import com.service.AdressService;

@Service
public class AdressServiceImpl implements AdressService{

	@Autowired
    private AdressRepository adressRepository;
	
	@Override
	public Adress addAdress(String name) {
		Adress savedAdress=new Adress(name);
		adressRepository.save(savedAdress);
		  return savedAdress;
	}

	@Override
	public void delete(int id) {
		adressRepository.delete(id);
	}

	@Override
	public Adress getByNameAdress(String name) {
		return adressRepository.findByNameAdress(name);		//mozhna jak realizaciju z adressRepository
	}

	@Override
	public Adress editAdress(String name) {		//tak mozhna update?
		Adress savedAdress=new Adress(name);
		if(savedAdress.getId()==0) 
		return adressRepository.save(savedAdress);
		else{
			adressRepository.save(savedAdress);
		}
		return savedAdress;
	}

	@Override
	@Transactional
	public Iterable<Adress> getAll() {
		return adressRepository.findAll();  //treba???????
	}

}
