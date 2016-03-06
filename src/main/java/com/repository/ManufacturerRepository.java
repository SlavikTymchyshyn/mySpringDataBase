package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Manufacturer;

@Repository
public interface ManufacturerRepository extends CrudRepository<Manufacturer, Integer>{

}
