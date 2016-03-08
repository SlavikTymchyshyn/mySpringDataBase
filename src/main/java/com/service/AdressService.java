package com.service;

import java.util.List;

import com.entity.Adress;

public interface AdressService {
	void addAdress(String name);
    void delete(int id);
    Adress getByNameAdress(String name);
    void updateAdress(String name);
    List<Adress> getAllAdresses();
}
