package com.repository.implementation;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.Customer;
import com.entity.Role;
import com.entity.Sex;
import com.repository.CustomerRepository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Customer> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Customer> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findByNamedFirstname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findByFamilySurname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findByMailName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findById(int iDname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findBySex(Sex name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findByRole(Role name) {
		// TODO Auto-generated method stub
		return null;
	}

}
