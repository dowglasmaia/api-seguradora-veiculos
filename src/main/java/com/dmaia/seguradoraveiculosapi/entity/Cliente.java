package com.dmaia.seguradoraveiculosapi.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.dmaia.seguradoraveiculosapi.entity.dto.ClienteDTO;

@Document(collection = "cliente")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String nome;
	private String cpf;
	private String cidade;
	private String uf;

	public Cliente() {
		
	}

	public Cliente(String id, String nome, String cpf, String cidade, String uf) {		
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	
	public Cliente create (ClienteDTO dto) {
		Cliente cliente = new Cliente(dto.getId(), dto.getNome(), dto.getCpf(), dto.getCidade(), dto.getUf());
		return cliente;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
