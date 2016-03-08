package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.TovarAmount;


public interface TovarAmountRepository extends CrudRepository<TovarAmount, Integer>{
	TovarAmount findById(int id);
}
