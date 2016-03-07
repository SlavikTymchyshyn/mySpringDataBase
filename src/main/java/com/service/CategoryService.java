package com.service;

import com.entity.Category;

public interface CategoryService {
	
	Category addCategory(String name);
    void delete(int id);
    Category getByName(String name);
    Category editCategory(String name);
    Iterable<Category> getAll();
}
