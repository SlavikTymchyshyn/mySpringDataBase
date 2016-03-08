package com.repository.implementation;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.Buy;
import com.repository.BuyRepository;

@Repository
public class BuyRepositoryImpl implements BuyRepository{

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Buy arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Buy> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Buy> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Buy> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Buy findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Buy> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Buy> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buy> findByTovarAmountsTovarModelName(String modName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buy> findByTovarAmountsTovarCategoryName(String catName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buy> findByCustomerMailName(String mailname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buy> findByDate(String date) {
		// TODO Auto-generated method stub
		return null;
	}

}
