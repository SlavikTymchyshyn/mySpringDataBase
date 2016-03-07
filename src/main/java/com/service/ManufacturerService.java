package com.service;

import com.entity.Manufacturer;

public interface ManufacturerService {
	Manufacturer addManufacturer(String name);
    void delete(int id);
    Manufacturer getByNameManufacturer(String name);
    Manufacturer editManufacturer(String name);
    Iterable<Manufacturer> getAll();
}
