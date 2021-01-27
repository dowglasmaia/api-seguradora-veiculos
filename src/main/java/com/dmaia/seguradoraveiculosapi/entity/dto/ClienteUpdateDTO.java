package com.dmaia.seguradoraveiculosapi.entity.dto;

import java.io.Serializable;

public class ClienteUpdateDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String nome;	
	private String cidade;
	private String uf;

	public ClienteUpdateDTO() {

	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
