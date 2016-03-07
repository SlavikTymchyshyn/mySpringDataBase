package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Named;
import com.repository.NamedRepository;
import com.service.NamedService;

@Service
public class NamedServiceImpl implements NamedService{
	
	@Autowired
	private NamedRepository dao;

	@Override
	public Named addNamed(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Named getByNameNamed(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Named editNamed(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Named> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
