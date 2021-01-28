package com.dmaia.seguradoraveiculosapi.entity.dto;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class ApoliceNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@DateTimeFormat(iso= ISO.DATE)
	private LocalDate inicioVigencia;
	
	@DateTimeFormat(iso= ISO.DATE)
	private LocalDate fimVigencia;
	
	private String placaVeiculo;
	
	@NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
	private Double valor;
	
	private String idCliente;

	public ApoliceNewDTO() {

	}

	public LocalDate getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(LocalDate inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public LocalDate getFimVigencia() {
		return fimVigencia;
	}

	public void setFimVigencia(LocalDate fimVigencia) {
		this.fimVigencia = fimVigencia;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

}
