package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Site;

@Repository
public interface SiteRepository extends CrudRepository<Site, Integer>{
	Site findByNameSite(String some);
}
