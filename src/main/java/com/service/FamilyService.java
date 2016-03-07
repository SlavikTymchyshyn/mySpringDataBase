package com.service;

import com.entity.Family;

public interface FamilyService {
	
	Family addFamily(String name);
    void delete(int id);
    Family getBySurname(String name);
    Family editFamily(String name);
    Iterable<Family> getAll();
}
