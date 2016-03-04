package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.entity.Buy;

public interface BuyRepository extends CrudRepository<Buy, Integer>{
	List<Buy> findByTovarAmountTovarModelName(String modName);
	List<Buy> findByTovarAmountTovarCategoryName(String catName);
}
