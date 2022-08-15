package br.com.tudodebom.api.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indica que a classe é armazenável no banco
@Table(name = "cliente") // torno explicito o nome da tabela

public class Cliente {
	
	@Column(name = "id") // explicito o nome da coluna
	@Id // PK coresponde a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private Integer id;

	@Column(name = "nome", length = 50, nullable = false)
	private String nome;

	@Column(name = "cpf", length = 15, nullable = false,unique=true)
	private String cpf;
	@Column(name = "email", length = 45, nullable = false, unique = true)
	private String email;
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
