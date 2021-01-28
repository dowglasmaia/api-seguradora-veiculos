package com.dmaia.seguradoraveiculosapi.entity.dto;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.dmaia.seguradoraveiculosapi.entity.Apolice;
import com.dmaia.seguradoraveiculosapi.entity.Cliente;

public class ApoliceDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String numero;	
	
	@DateTimeFormat(iso= ISO.DATE)
	private LocalDate inicioVigencia;
	
	@DateTimeFormat(iso= ISO.DATE)
	private LocalDate fimVigencia;
	
	private String placaVeiculo;
	
	@NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
	private Double valor;
	
	private Cliente cliente;

	private Boolean isVencido;
	
	private int diasAvencer;
	
	public ApoliceDTO() {	}

	public ApoliceDTO(Apolice apolice) {
		this.numero = apolice.getNumero();
		this.inicioVigencia = apolice.getInicioVigencia();
		this.fimVigencia = apolice.getFimVigencia();
		this.placaVeiculo = apolice.getPlacaVeiculo();
		this.valor = apolice.getValor();
		this.cliente = apolice.getCliente();
	
		this.isVencido = (LocalDate.now().isAfter(fimVigencia) || LocalDate.now().equals(fimVigencia) )   ?  true : false ;	
		
		this.diasAvencer = (LocalDate.now().isAfter(fimVigencia) || LocalDate.now().equals(fimVigencia) ) 
						? 0 
						: fimVigencia.minusDays(inicioVigencia.getDayOfMonth()).getDayOfMonth() ;		
	}
	

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Boolean getIsVencido() {
		return isVencido;
	}

	public int getDiasAvencer() {
		return diasAvencer;
	}
	
	

}
