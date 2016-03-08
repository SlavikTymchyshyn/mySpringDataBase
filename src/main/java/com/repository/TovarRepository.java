package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Tovar;


public interface TovarRepository extends CrudRepository<Tovar, Integer>{
	Tovar findById(int id);
}
