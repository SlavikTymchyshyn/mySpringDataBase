package com.repository.implementation;

import org.springframework.transaction.annotation.Transactional;

import com.entity.Phone;
import com.repository.PhoneRepository;

public class PhoneRepositoryImpl implements PhoneRepository{

	private PhoneRepository repo;
		
	public PhoneRepository getRepo() {
		return repo;
	}

	public void setRepo(PhoneRepository repo) {
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
	public void delete(Iterable<? extends Phone> arg0) {
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
	public Iterable<Phone> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Phone> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Phone> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Phone> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Phone findByName(String name) {
		Phone ph=null;
		for (Phone phones : repo.findAll()) {
			if(phones.getName().equalsIgnoreCase(name)){
				ph=phones;
				return ph;
			}else{return null;}
		}
		return ph;
	}

	@Override
	@Transactional
	public void insertPhone(String name) {
		repo.save(new Phone(name));
	}

	@Override
	@Transactional
	public void delete(String name) {						//treba???????
		if(!(repo.findByName(name)).equals(null)){
			repo.delete(repo.findByName(name));
		}
		else{
			throw new IllegalArgumentException("wrong name");
		}
	}
	@Override
	public void delete(Phone arg0) {
		// TODO Auto-generated method stub
		
	}

}
