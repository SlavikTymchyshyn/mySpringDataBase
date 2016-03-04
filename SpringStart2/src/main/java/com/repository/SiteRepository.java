package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.entity.Site;

public interface SiteRepository extends CrudRepository<Site, Integer>{
	List<Site> findByNameSite(String some);
}
