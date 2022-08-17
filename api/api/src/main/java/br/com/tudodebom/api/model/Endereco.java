package br.com.tudodebom.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="endereco")
public class Endereco {

	@Id 
	@Column(name = "IDendereco")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer IDendereco;

	@Column(name = "estado", length = 45, nullable = false)
	private String estado;

	@Column(name = "cidade", length = 45, nullable = false)
	private String cidade;
	
	@Column(name = "cep", length = 15, nullable = false)
	private String cep;
	
	@Column(name = "rua", length = 45, nullable = true)
	private String rua;

	@ManyToOne
	@JoinColumn(name="cliente_IDcliente")
	@JsonIgnoreProperties("enderecos")
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

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


	
	
	

}
