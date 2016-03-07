package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Customer;
import com.repository.CustomerRepository;
import com.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository dao;

	@Override
	public Customer addCustomer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getByMailName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer editCustomer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
