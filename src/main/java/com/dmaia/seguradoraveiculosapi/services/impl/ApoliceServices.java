package com.dmaia.seguradoraveiculosapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmaia.seguradoraveiculosapi.entity.Apolice;
import com.dmaia.seguradoraveiculosapi.entity.Cliente;
import com.dmaia.seguradoraveiculosapi.entity.dto.ApoliceNewDTO;
import com.dmaia.seguradoraveiculosapi.entity.dto.ApoliceUpdateDTO;
import com.dmaia.seguradoraveiculosapi.repository.ApoliceRepository;
import com.dmaia.seguradoraveiculosapi.repository.ClienteRepository;
import com.dmaia.seguradoraveiculosapi.services.IApoliceService;

@Service
public class ApoliceServices extends CrudServices<Apolice, String> implements IApoliceService {
	private static final long serialVersionUID = 1L;

	private ApoliceRepository repository; 	
	
	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ApoliceServices(ApoliceRepository repository, ClienteRepository clienteRepository) {
		super(repository);
		this.repository = repository;
		this.clienteRepository = clienteRepository;
	}


	@Override
	public Apolice createApoliceFromToDTO(ApoliceNewDTO dto) {
		Cliente cliente = clienteRepository.findById(dto.getIdCliente()).orElseThrow(
				()-> new RuntimeException("Cliente não localizado para o ID: "+dto.getIdCliente()) );
				
			Apolice apolice = new Apolice(
					null,
					dto.getInicioVigencia(),
					dto.getFimVigencia(), 
					dto.getPlacaVeiculo(),
					dto.getValor(), 
					cliente);		
		return apolice;
	}
	
	@Override
	public Apolice updateApoliceFromToDTO(Apolice apolice,ApoliceUpdateDTO dto) {
			apolice.setValor(dto.getValor());	
		return apolice;
	}



	@Override
	public Apolice findByNumero(String numero) {		
		return repository.findByNumero(numero)
				.orElseThrow( () -> new RuntimeException(""));
	}

	
	

}
