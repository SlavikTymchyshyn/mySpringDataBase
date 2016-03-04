package com.service;

import java.util.List;

import com.entity.Adress;

public interface AdressService {
	Adress addAdress(Adress adress);
    void delete(int id);
    Adress getByNameAdress(String name);
    Adress editAdress(Adress adress);
    List<Adress> getAll();
}
