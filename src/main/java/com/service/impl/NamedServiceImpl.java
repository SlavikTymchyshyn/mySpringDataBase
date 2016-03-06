package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.NamedRepository;
import com.service.NamedService;

@Service
public class NamedServiceImpl implements NamedService{
	
	@Autowired
	private NamedRepository dao;
}
