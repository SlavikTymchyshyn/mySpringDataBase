package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Adress;
import com.repository.AdressRepository;
import com.service.AdressService;

@Service("adressService")
public class AdressServiceImpl implements AdressService{

	@Autowired
    private AdressRepository repo;
	
	@Override
	public void addAdress(String name) {
		repo.insertAdress(name);
	}

	@Override
	public void delete(int id) {
		repo.delete(id);
	}

	@Override
	public Adress getByNameAdress(String name) {
		return repo.findByNameAdress(name);		//mozhna jak realizaciju z adressRepository
	}

	@Override
	public void updateAdress(String name) {		//tak mozhna update?
		Adress up=repo.findByNameAdress(name);
		if(!up.equals(null)){
			System.out.println("there already exists such name");
		}
		else{
			repo.save(new Adress(name));
		}
		
	}

	@Override
	public List<Adress> getAllAdresses() {
		return repo.findAll();  //treba???????
	}

}
