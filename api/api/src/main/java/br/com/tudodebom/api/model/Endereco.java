package br.com.tudodebom.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indica que a classe é armazenavel no banco
@Table(name = "endereco") // torno explicito o nome da tabela

public class Endereco {

	/***
	 * 
	 *foi feito a estruturação dos atributos 
	 *para poder se comunicar com os campos do banco de dados
/
	 */
	
	
	@Column(name = "IDendereco") // explicito o nome da coluna
	@Id // PK coresponde a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremete
	private Integer IDendereco;

	@Column(name = "estado", length = 45, nullable = false)
	private String estado;

	@Column(name = "cidade", length = 45, nullable = false)
	private String cidade;
	@Column(name = "cep", length = 15, nullable = false, unique = true)
	private String cep;
	
	@Column(name = "rua", length = 45, nullable = true)
	private String rua;
	
	@Column(name = "cliente_id_cliente",nullable = false)//chave estrageira
	
	private String cliente_id_cliente;

	
	public Integer getIDendereco() {
		return IDendereco;
	}

	public void setIDendereco(Integer iDendereco) {
		IDendereco = iDendereco;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCliente_id_cliente() {
		return cliente_id_cliente;
	}

	public void setCliente_id_cliente(String cliente_id_cliente) {
		this.cliente_id_cliente = cliente_id_cliente;
	}
	
	

}
