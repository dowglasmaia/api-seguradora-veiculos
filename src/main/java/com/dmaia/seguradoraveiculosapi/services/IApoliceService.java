package com.dmaia.seguradoraveiculosapi.services;

import org.springframework.stereotype.Service;

import com.dmaia.seguradoraveiculosapi.entity.Apolice;
import com.dmaia.seguradoraveiculosapi.entity.dto.ApoliceNewDTO;
import com.dmaia.seguradoraveiculosapi.entity.dto.ApoliceUpdateDTO;

@Service
public interface IApoliceService extends ICrudServices<Apolice, String>{	

	Apolice createApoliceFromToDTO (ApoliceNewDTO dto);
	
	Apolice updateApoliceFromToDTO(Apolice apolice, ApoliceUpdateDTO dto) ;
	
	Apolice findByNumero(String numero);
	

}
