package com.dmaia.seguradoraveiculosapi.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ICrudServices<T, PK > extends Serializable {	

	T save(T entity);
	
	T update(T entity);
	
	T findById(PK id);
	
	void delete (PK id);

	List<T> findAll();

}
