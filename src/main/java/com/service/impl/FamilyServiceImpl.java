package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.FamilyRepository;
import com.service.FamilyService;

@Service
public class FamilyServiceImpl implements FamilyService{

	@Autowired
	private FamilyRepository dao;
}
