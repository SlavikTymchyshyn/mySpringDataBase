package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Tovar;

@Repository
public interface TovarRepository extends CrudRepository<Tovar, Integer>{

}
