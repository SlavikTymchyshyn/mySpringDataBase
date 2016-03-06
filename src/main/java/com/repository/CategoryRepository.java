package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{
	Category findByName(String name);
}
