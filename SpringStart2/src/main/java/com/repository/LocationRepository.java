package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
