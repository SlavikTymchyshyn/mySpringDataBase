package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Tovar;
import com.repository.TovarRepository;
import com.service.TovarService;

@Service
public class TovarServiceImpl implements TovarService{
	
	@Autowired
    private	TovarRepository dao;

	@Override
	public Tovar addTovar(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tovar getByNameTovar(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tovar editTovar(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Tovar> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
