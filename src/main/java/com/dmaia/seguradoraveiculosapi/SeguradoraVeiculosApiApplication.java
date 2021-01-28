package com.dmaia.seguradoraveiculosapi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dmaia.seguradoraveiculosapi.entity.Apolice;
import com.dmaia.seguradoraveiculosapi.entity.Cliente;
import com.dmaia.seguradoraveiculosapi.repository.ApoliceRepository;
import com.dmaia.seguradoraveiculosapi.repository.ClienteRepository;

@SpringBootApplication
public class SeguradoraVeiculosApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SeguradoraVeiculosApiApplication.class, args);
	}

	@Autowired
	ApoliceRepository apoliceRepository; 
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Cliente cliente = new Cliente(null, "Maia", "56461209930", "Goiania", "GO");
		clienteRepository.save(cliente);
		
		
		Apolice ap1 = new Apolice(null, LocalDate.now(), LocalDate.now(), "SDC-68A98", 200.2, cliente);
		apoliceRepository.save(ap1);*/
		
		
		
		
	}

}
