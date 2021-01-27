package com.dmaia.seguradoraveiculosapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.dmaia.seguradoraveiculosapi.entity.Cliente;
import com.dmaia.seguradoraveiculosapi.repository.ClienteRepository;
import com.dmaia.seguradoraveiculosapi.services.IClienteService;

@Service
public class ClienteServices extends  CrudServices<Cliente, String> implements IClienteService {
	private static final long serialVersionUID = 1L;

	private ClienteRepository repository;
	
	@Autowired
	public ClienteServices(MongoRepository<Cliente, String> repo, ClienteRepository repository) {
		super(repo);
		this.repository =repository;
	}




}
