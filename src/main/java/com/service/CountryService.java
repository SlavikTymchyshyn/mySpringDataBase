package com.service;

import com.entity.Country;

public interface CountryService {

	Country addCountry(String name);
    void delete(int id);
    Country getByNameCountry(String name);
    Country editCountry(String name);
    Iterable<Country> getAll();
}
