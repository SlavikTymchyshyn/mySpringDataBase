package com.repository.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Country;
import com.entity.Family;
import com.repository.FamilyRepository;

@Repository
public class FamilyRepositoryImpl implements FamilyRepository{
	
	private FamilyRepository repo;
	
	public FamilyRepository getRepo() {
		return repo;
	}

	public void setRepo(FamilyRepository repo) {
		this.repo = repo;
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
	public void delete(Family arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Family> arg0) {
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
	public Iterable<Family> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Family> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Family findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Family> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Family> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Family findBySurname(String name) {
		Family fam=null;
		for (Family surname : repo.findAll()) {
			if(surname.getSurname().equalsIgnoreCase(name)){
				fam=surname;
				return fam;
			}else{return null;}
		}
		return fam;
	}

	@Override
	@Transactional
	public void insertFamily(String name) {
		repo.save(new Family(name));
	}

}
