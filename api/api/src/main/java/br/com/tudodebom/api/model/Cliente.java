package br.com.tudodebom.api.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // indica que a classe é armazenável no banco
@Table(name = "cliente") // torno explicito o nome da tabela

public class Cliente {
	
	@Column(name = "IDcliente") // explicito o nome da coluna
	@Id // PK coresponde a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private Integer IDcliente;

	@Column(name = "nome", length = 50, nullable = false)
	//garantir que nos passemos um nome com pelo menos um caracter
	@NotEmpty
	private String nome;

<<<<<<< HEAD
=======
	@Column(name = "cpf", length = 15, nullable = false,unique=false)
>>>>>>> e046d749d5f547409627cf1cec6ff89a2cd6dea8
	@CPF
	@Column(name = "cpf", length = 15, nullable = false,unique=true)
	private String cpf;
	
	@Column(name = "email", length = 45, nullable = false,unique=true)
	@Email(message="Informe um e-mail válido") //vai verificar se seu email tem @ e ponto
	private String email;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("cliente")
	private List<Endereco> enderecos;

	
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
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
}
