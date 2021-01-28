package com.dmaia.seguradoraveiculosapi.entity.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class ApoliceUpdateDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull (message = "O Campo Valor � Obrigat�rio")
	private Double valor;	

	public ApoliceUpdateDTO() {

	}


	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}


}
