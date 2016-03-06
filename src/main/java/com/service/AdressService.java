package com.service;

import com.entity.Adress;

public interface AdressService {
	Adress addAdress(String name);
    void delete(int id);
    Adress getByNameAdress(String name);
    Adress editAdress(String name);
    Iterable<Adress> getAll();
}
