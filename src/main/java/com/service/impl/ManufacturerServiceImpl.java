package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Manufacturer;
import com.repository.ManufacturerRepository;
import com.service.ManufacturerService;

@Service
public class ManufacturerServiceImpl implements ManufacturerService{

	@Autowired
	private ManufacturerRepository dao;

	@Override
	public Manufacturer addManufacturer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Manufacturer getByNameManufacturer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manufacturer editManufacturer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Manufacturer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
