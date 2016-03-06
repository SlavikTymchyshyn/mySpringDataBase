package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.ManufacturerRepository;
import com.service.ManufacturerService;

@Service
public class ManufacturerServiceImpl implements ManufacturerService{

	@Autowired
	private ManufacturerRepository dao;
}
