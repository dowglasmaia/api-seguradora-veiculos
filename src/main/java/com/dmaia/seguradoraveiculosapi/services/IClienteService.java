package com.dmaia.seguradoraveiculosapi.services;

import org.springframework.stereotype.Service;

import com.dmaia.seguradoraveiculosapi.entity.Cliente;
import com.dmaia.seguradoraveiculosapi.entity.dto.ClienteDTO;
import com.dmaia.seguradoraveiculosapi.entity.dto.ClienteUpdateDTO;

@Service
public interface IClienteService extends ICrudServices<Cliente, String>{	

	Cliente createClienteFromToDTO (ClienteDTO dto);
	
	Cliente updateClienteFromToDTO (Cliente cliente, ClienteUpdateDTO dto);

}
