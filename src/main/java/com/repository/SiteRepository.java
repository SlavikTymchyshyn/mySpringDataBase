package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.Site;

public interface SiteRepository extends CrudRepository<Site, Integer>{
	Site findByNameSite(String some);
}
