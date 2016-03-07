package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Location;
import com.repository.LocationRepository;
import com.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationRepository dao;

	@Override
	public Location addLocation(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Location getByIdLocation(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location editLocation(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Location> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
