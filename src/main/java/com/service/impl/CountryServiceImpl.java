package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Country;
import com.repository.CountryRepository;
import com.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{
	
	@Autowired
    private CountryRepository dao;

	@Override
	public Country addCountry(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Country getByNameCountry(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country editCountry(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Country> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
