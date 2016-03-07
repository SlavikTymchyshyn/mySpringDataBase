package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Category;
import com.repository.CategoryRepository;
import com.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
    private CategoryRepository dao;

	@Override
	public Category addCategory(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category editCategory(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
