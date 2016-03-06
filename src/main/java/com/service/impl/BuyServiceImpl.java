package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.BuyRepository;
import com.service.BuyService;

@Service
public class BuyServiceImpl implements BuyService{
	
	@Autowired
    private BuyRepository dao;
}
