package com.dmaia.seguradoraveiculosapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmaia.seguradoraveiculosapi.entity.Cliente;
import com.dmaia.seguradoraveiculosapi.entity.dto.ClienteDTO;
import com.dmaia.seguradoraveiculosapi.entity.dto.ClienteUpdateDTO;
import com.dmaia.seguradoraveiculosapi.repository.ClienteRepository;
import com.dmaia.seguradoraveiculosapi.services.IClienteService;

@Service
public class ClienteServices extends CrudServices<Cliente, String> implements IClienteService {
	private static final long serialVersionUID = 1L;

	private ClienteRepository repository; 
	
	@Autowired
	public ClienteServices(ClienteRepository repository) {
		super(repository);
		this.repository = repository;
	}

	@Override
	public Cliente createClienteFromToDTO(ClienteDTO dto) {		
		Cliente cliente = new Cliente(
				dto.getId(), 
				dto.getNome(), 
				dto.getCpf(),
				dto.getCidade(),
				dto.getUf());
		return cliente;
	}

	@Override
	public Cliente updateClienteFromToDTO(Cliente cliente, ClienteUpdateDTO dto) {
			cliente.setNome(dto.getNome());
			cliente.setCidade(dto.getCidade());
			cliente.setUf(dto.getUf());
			
		return cliente;
	}
	
	

}
