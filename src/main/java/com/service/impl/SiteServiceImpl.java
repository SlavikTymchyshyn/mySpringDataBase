package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.SiteRepository;
import com.service.SiteService;

@Service
public class SiteServiceImpl implements SiteService{

	@Autowired
    private	SiteRepository siteRepository;
}
