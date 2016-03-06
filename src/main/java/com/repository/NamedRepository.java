package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Named;

@Repository
public interface NamedRepository extends CrudRepository<Named, Integer>{

	Named findByFirstname(String first);
}
