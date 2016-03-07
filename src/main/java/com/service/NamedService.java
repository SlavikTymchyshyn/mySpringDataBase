package com.service;

import com.entity.Named;

public interface NamedService {

	Named addNamed(String name);
    void delete(int id);
    Named getByNameNamed(String name);
    Named editNamed(String name);
    Iterable<Named> getAll();
}
