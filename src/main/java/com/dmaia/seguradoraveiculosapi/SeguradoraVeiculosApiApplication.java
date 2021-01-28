package com.dmaia.seguradoraveiculosapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

	}

}
