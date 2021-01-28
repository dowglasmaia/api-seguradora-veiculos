package com.dmaia.seguradoraveiculosapi.entity.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import com.dmaia.seguradoraveiculosapi.entity.Cliente;
import com.dmaia.seguradoraveiculosapi.entity.utils.UnicoCPF;

public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	
	@NotEmpty(message = "O Campo Nome � Obrigat�rio")
	private String nome;
	
	@UnicoCPF(message = "CPF j� cadastrado em nossa Base de dados.")
	private String cpf;
	
	@NotEmpty(message = "O Campo Cidade � Obrigat�rio")
	private String cidade;
	
	@NotEmpty(message = "O Campo UF � Obrigat�rio")
	private String uf;

	public ClienteDTO() {

	}

	public ClienteDTO(Cliente cliente) {
		super();
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.cpf = cliente.getCpf();
		this.cidade = cliente.getCidade();
		this.uf = cliente.getUf();
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

}
