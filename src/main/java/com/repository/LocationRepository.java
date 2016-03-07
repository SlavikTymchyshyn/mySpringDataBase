package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {
	List<Location> findByCountryNameCountry(String kraina);
	List<Location> findByAdressNameAdress(String adresa);
	Location findById(int id);
	//List<Location> findByphoneNumberPhone(String name);
}
