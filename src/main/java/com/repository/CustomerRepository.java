package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.entity.Customer;
import com.entity.Role;
import com.entity.Sex;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	List<Customer> findByNamedFirstname(String name);
	List<Customer> findByFamilySurname(String name);
	Customer findByMailName(String name);
	Customer findById(int iDname);
	List<Customer> findBySex(Sex name);
	List<Customer> findByRole(Role name);
	//void insertCustomer(String name);		//treba?
	void delete(String name);
}
