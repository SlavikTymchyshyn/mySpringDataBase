package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.TovarAmountRepository;
import com.service.TovarAmountService;

@Service
public class TovarAmountServiceImpl implements TovarAmountService{

	@Autowired
    private	TovarAmountRepository dao;
}
