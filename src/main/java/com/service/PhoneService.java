package com.service;

import com.entity.Phone;

public interface PhoneService {
	Phone addPhone(String name);
    void delete(int id);
    Phone getByName(String name);
    Phone editPhone(String name);
    Iterable<Phone> getAll();
}
