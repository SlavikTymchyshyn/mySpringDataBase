package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Site;
import com.repository.SiteRepository;
import com.service.SiteService;

@Service
public class SiteServiceImpl implements SiteService{

	@Autowired
    private	SiteRepository siteRepository;

	@Override
	public void addSite(String name) {
		Site siteadd=new Site(name);
		siteRepository.save(siteadd);
		}

	@Override
	public void delete(int id) {
		siteRepository.delete(id);		
	}

	@Override
	public Site getByName(String name) {
		Site s=siteRepository.findByNameSite(name);
		return s;
	}

	@Override
	public Site editSite(String name) {
		
		if (!siteRepository.findByNameSite(name).equals(null))
			return null;
		else 
		siteRepository.save(new Site(name));
		return null;
	}

	@Override
	public Iterable<Site> getAll() {
		Iterable<Site> sI=siteRepository.findAll();
		return sI;
	}
}
