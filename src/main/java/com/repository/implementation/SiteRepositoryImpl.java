package com.repository.implementation;

import org.springframework.transaction.annotation.Transactional;

import com.entity.Site;
import com.entity.Site;
import com.repository.SiteRepository;

public class SiteRepositoryImpl implements SiteRepository{

	private SiteRepository repo;
		
	public SiteRepository getRepo() {
		return repo;
	}

	public void setRepo(SiteRepository repo) {
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
	public void delete(Site arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Site> arg0) {
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
	public Iterable<Site> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Site> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Site findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Site> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Site> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Site findByNameSite(String some) {
		Site site=null;
		for (Site sites : repo.findAll()) {
			if(sites.getNameSite().equalsIgnoreCase(some)){
				site=sites;
				return site;
			}else{return null;}
		}
		return site;
	}

	@Override
	@Transactional
	public void insertSite(String name) {
		repo.save(new Site(name));
	}

}
