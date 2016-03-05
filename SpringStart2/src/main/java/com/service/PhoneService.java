package com.service;

import java.util.List;

import com.entity.Phone;

public interface PhoneService {
	Phone addPhone(String name);
    void delete(int id);
    Phone getByNamePhone(String name);
    Phone editPhone(String name);
    Iterable<Phone> getAll();
}
