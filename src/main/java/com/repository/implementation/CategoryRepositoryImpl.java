package com.repository.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.entity.Category;
import com.repository.CategoryRepository;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository{

	private CategoryRepository repo;
	
		
	public CategoryRepository getRepo() {
		return repo;
	}

	public void setRepo(CategoryRepository repo) {
		this.repo = repo;
	}

	@Override
	@Transactional
	public Category findByName(String name) {
		Category category=null;
		for (Category cat : repo.findAll()) {
			if(cat.getName().equalsIgnoreCase(name)){
				category=cat;
				return category;
			}else{return null;}
		}
		return category;
	}

	@Override
	@Transactional
	public void insertCategory(String nameAdress) {
		repo.save(new Category(nameAdress));
	}
	
	@Override
	@Transactional
	public Iterable<Category> findAll() {
		return repo.findAll();
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Category arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Category> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Category> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Category> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Category> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


}
