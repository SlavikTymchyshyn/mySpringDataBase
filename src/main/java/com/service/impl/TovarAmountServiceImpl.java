package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.TovarAmount;
import com.repository.TovarAmountRepository;
import com.service.TovarAmountService;

@Service
public class TovarAmountServiceImpl implements TovarAmountService{

	@Autowired
    private	TovarAmountRepository dao;

	@Override
	public TovarAmount addTovarAmount(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TovarAmount getByNameTovarAmount(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TovarAmount editTovarAmount(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<TovarAmount> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
