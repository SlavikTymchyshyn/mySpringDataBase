package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.entity.Buy;

public interface BuyRepository extends CrudRepository<Buy, Integer>{
	List<Buy> findByTovarAmountsTovarModelName(String modName);
	List<Buy> findByTovarAmountsTovarCategoryName(String catName);
}
