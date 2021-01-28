package com.dmaia.seguradoraveiculosapi.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dmaia.seguradoraveiculosapi.entity.Apolice;

@Repository
public interface ApoliceRepository extends MongoRepository<Apolice, String>{

	Optional<Apolice> findByNumero(String numero);

}
