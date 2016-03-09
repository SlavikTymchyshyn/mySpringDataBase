package com.repository.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.entity.Country;
import com.repository.CountryRepository;

@Repository
public class CountryRepositoryImpl implements CountryRepository{
	
	private CountryRepository repo;
		
	public CountryRepository getRepo() {
		return repo;
	}

	public void setRepo(CountryRepository repo) {
		this.repo = repo;
	}
	
	@Override
	@Transactional
	public Country findByNameCountry(String name) {
		Country kraina=null;
		for (Country country : repo.findAll()) {
			if(country.getNameCountry().equalsIgnoreCase(name)){
				kraina=country;
				return kraina;
			}else{return null;}
		}
		return kraina;
	}
	
	@Override
	@Transactional
	public void insertCountry(String name) {
		repo.save(new Country(name));
	}
	
	
	
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
	public void delete(Country arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Country> arg0) {
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
	public Iterable<Country> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Country> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Country> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Country> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
