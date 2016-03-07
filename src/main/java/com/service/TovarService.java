package com.service;

import com.entity.Tovar;

public interface TovarService {

	Tovar addTovar(String name);
    void delete(int id);
    Tovar getByNameTovar(String name);
    Tovar editTovar(String name);
    Iterable<Tovar> getAll();
}
