package com.repository.implementation;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Adress;
import com.repository.AdressRepository;

@Repository
public class AdressRepositoryImpl implements AdressRepository{
	
	private AdressRepository repo;
	
	public AdressRepository getRepo() {
		return repo;
	}

	public void setRepo(AdressRepository repo) {
		this.repo = repo;
	}
	
	@Override
	@Transactional
	public Adress findByNameAdress(String nameAdress) {
		Adress a=null;
		for (Adress adress : repo.findAll()) {
			if(adress.getNameAdress().equalsIgnoreCase(nameAdress)){
				a=adress;
				return a;
			}else{return null;}
		}
		return a;
	}

	@Override
	@Transactional
	public void insertAdress(String nameAdress) {
		repo.save(new Adress(nameAdress));
	}
	
	@Override
	@Transactional
	public List<Adress> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(Iterable<? extends Adress> arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Adress> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adress findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Adress> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Adress> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long count() {
		return repo.count();
	}

	@Override
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public void delete(Adress adr) {
		repo.delete(adr);
	}
	
	@Override
	public void deleteAll() {
		repo.deleteAll();
	}

	

}
