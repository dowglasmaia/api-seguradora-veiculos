package com.dmaia.seguradoraveiculosapi.entity.utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.dmaia.seguradoraveiculosapi.repository.ClienteRepository;

public class UnicoCPFValidator implements ConstraintValidator<UnicoCPF, String> {

	@Autowired
	private ClienteRepository repo;

	@Override
	public boolean isValid(String cpf, ConstraintValidatorContext context) {
		return !repo.findByCpf(cpf).isPresent();
	}

}