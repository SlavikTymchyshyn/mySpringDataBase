package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.Named;

public interface NamedRepository extends CrudRepository<Named, Integer>{

	Named findByFirstname(String first);
}
