package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Customer;
import com.entity.Role;
import com.entity.Sex;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	List<Customer> findByNamedFirstname(String name);
	List<Customer> findByFamilySurname(String name);
	Customer findByMailName(String name);
	Customer findById(int iDname);
	List<Customer> findBySex(Sex name);
	List<Customer> findByRole(Role name);
}
