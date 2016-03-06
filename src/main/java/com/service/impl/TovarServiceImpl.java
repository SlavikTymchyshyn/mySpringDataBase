package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.TovarRepository;
import com.service.TovarService;

@Service
public class TovarServiceImpl implements TovarService{
	
	@Autowired
    private	TovarRepository dao;
}
