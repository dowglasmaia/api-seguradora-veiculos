package com.dmaia.seguradoraveiculosapi.services.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.dmaia.seguradoraveiculosapi.services.ICrudServices;

@Component
public abstract class CrudServices<T, PK extends Serializable> implements ICrudServices<T, PK> {
	private static final long serialVersionUID = 1L;

	private MongoRepository<T, PK> repository;

	
	@Autowired
	public CrudServices(MongoRepository<T, PK> repo) {
		this.repository = repo;
	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public T findById(PK id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Recurso não encontrado para o ID: " + id));
	}

	@Override
	public T save(T entity) {
		try {
			return repository.save(entity);
		} catch (Exception e) {
			throw new RuntimeException("Falha ao tentar salvar recurso");
		}

	}

	@Override
	public T update(T entity) {
		try {
			return repository.save(entity);
		} catch (Exception e) {
			throw new RuntimeException("Falha ao tentar atualizar dados do recurso");
		}
	}

	@Override
	public void delete(PK id) {
		try {
			findById(id);
			repository.deleteById(id);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
