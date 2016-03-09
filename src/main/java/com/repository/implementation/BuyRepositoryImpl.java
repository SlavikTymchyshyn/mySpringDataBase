package com.repository.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Buy;
import com.repository.BuyRepository;

@Repository
public class BuyRepositoryImpl implements BuyRepository{

	@PersistenceContext(unitName = "Primary")
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}
	
	public void setEm(EntityManager em) {
		this.em = em;
	}
		
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Buy> findAll() {
		return em.createQuery("from Buy").getResultList();
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Buy> findByTovarAmountsTovarCategoryName(String catName) {
		return em.createQuery("select b from Buy b where b.tovarAmounts.tovar.category.name = :name")
				.setParameter("name", catName).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Buy> findByCustomerMailName(String mailname) {
		return em.createQuery("select b from Buy b where b.customer.mailName = :name")
				.setParameter("name", mailname).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Buy> findByDate(String date) {
		return em.createQuery("select b from Buy b where b.date = :name")
				.setParameter("name", date).getResultList();
	}
		
	@SuppressWarnings("unchecked")
	@Override
	public List<Buy> findByTovarAmountsTovarModelName(String modName) {
		return em.createQuery("select b from Buy b where b.tovarAmounts.tovar.modelName = :name")
				.setParameter("name", modName).getResultList();
	}
	
	
	
//	@Override
//	@Transactional
//	public List<Buy> findByTovarAmountsTovarModelName(String modName) {
//		List <Buy> bl=(List<Buy>) repo.findAll();
//		List<Buy> forFind=new ArrayList<>();
//		Iterator <Buy> buyIter=bl.iterator();
//		while(buyIter.hasNext()){
//			Buy temp=buyIter.next();
//			Iterator <TovarAmount> taIt=temp.getTovarAmounts().iterator();
//			while(taIt.hasNext()){
//				TovarAmount tmp=taIt.next();
//				if(tmp.getTovar().getModelName().equalsIgnoreCase(modName)){
//					forFind.add(temp);
//				}
//			}
//		}
//		return forFind;
//	}

		
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
	public void delete(Buy arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Buy> arg0) {
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
	public Iterable<Buy> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Buy findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Buy> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Buy> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
