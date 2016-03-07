package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Buy;

@Repository
public interface BuyRepository extends CrudRepository<Buy, Integer>{
	List<Buy> findByTovarAmountsTovarModelName(String modName);
	List<Buy> findByTovarAmountsTovarCategoryName(String catName);
	List<Buy> findByCustomerMailName(String mailname);
	List<Buy> findByDate(String date);
	
}
