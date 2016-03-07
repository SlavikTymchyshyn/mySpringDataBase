package com.service;

import com.entity.Customer;

public interface CustomerService {
	
	Customer addCustomer(String name);
    void delete(int id);
    Customer getByMailName(String name);
    Customer editCustomer(String name);
    Iterable<Customer> getAll();
}
