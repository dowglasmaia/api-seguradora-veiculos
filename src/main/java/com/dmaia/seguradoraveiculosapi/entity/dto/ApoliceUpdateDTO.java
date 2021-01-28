package com.dmaia.seguradoraveiculosapi.entity.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class ApoliceUpdateDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull (message = "O Campo Valor é Obrigatório")
	@NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
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
