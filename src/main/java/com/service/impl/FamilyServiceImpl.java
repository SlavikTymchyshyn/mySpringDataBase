package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Family;
import com.repository.FamilyRepository;
import com.service.FamilyService;

@Service
public class FamilyServiceImpl implements FamilyService{

	@Autowired
	private FamilyRepository dao;

	@Override
	public Family addFamily(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Family getBySurname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Family editFamily(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Family> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
