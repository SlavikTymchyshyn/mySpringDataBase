package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.CountryRepository;
import com.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{
	
	@Autowired
    private CountryRepository dao;
}
