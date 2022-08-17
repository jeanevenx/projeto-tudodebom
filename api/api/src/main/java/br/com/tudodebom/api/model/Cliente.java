package br.com.tudodebom.api.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.tudodebom.api.services.validarCPF;

@Entity // indica que a classe é armazenável no banco
@Table(name = "cliente") // torno explicito o nome da tabela

public class Cliente {
	
	@Column(name = "IDcliente") // explicito o nome da coluna
	@Id // PK coresponde a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private Integer IDcliente;

	@Column(name = "nome", length = 50, nullable = false)
	private String nome;

	@Column(name = "cpf", length = 15, nullable = false,unique=true)
	private String cpf;
	@Column(name = "email", length = 45, nullable = false, unique = true)
	private String email;
	@Column(name = "telefone", length = 20, nullable = false)
	private String telefone;
	

	
	
	public Integer getIDcliente() {
		return IDcliente;
	}
	public void setIDcliente(Integer iDcliente) {
		IDcliente = iDcliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	public String getCpf() {
		this.cpf = validarCPF.validar(cpf);
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
