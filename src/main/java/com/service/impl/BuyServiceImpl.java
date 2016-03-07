package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Buy;
import com.repository.BuyRepository;
import com.service.BuyService;

@Service
public class BuyServiceImpl implements BuyService{
	
	@Autowired
    private BuyRepository dao;

	@Override
	public Buy addBuy(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Buy getByCustomerMailName(String mailname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Buy editBuy(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Buy> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
