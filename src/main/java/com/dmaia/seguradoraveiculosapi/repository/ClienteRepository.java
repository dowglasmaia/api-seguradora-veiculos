package com.dmaia.seguradoraveiculosapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dmaia.seguradoraveiculosapi.entity.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String>{

}
