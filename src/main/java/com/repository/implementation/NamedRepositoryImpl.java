package com.repository.implementation;

import org.springframework.transaction.annotation.Transactional;
import com.entity.Named;
import com.repository.NamedRepository;

public class NamedRepositoryImpl implements NamedRepository{
	
	private NamedRepository repo;
	
	public NamedRepository getRepo() {
		return repo;
	}

	public void setRepo(NamedRepository repo) {
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
	public void delete(Named arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Named> arg0) {
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
	public Iterable<Named> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Named> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Named findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Named> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Named> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Named findByFirstname(String first) {
		Named name=null;
		for (Named names : repo.findAll()) {
			if(names.getFirstname().equalsIgnoreCase(first)){
				name=names;
				return name;
			}else{return null;}
		}
		return name;
	}

	@Override
	@Transactional
	public void insertName(String name) {
		repo.save(new Named(name));
	}

}
