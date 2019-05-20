package com.online.store.services;

import java.util.List;

public interface IBaseService<T> {
 
	public List<T> findAll();
	
	public T findById(final long id);
	
	public T persist(T entity);
	
	public T modify(T entity);
	
	public T delete(T entity);
}
