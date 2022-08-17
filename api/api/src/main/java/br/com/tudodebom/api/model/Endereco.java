package br.com.tudodebom.api.model;




import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.repository.CrudRepository;

<<<<<<< HEAD

@Entity
@Table(name="endereco")
=======
@Entity // indica que a classe é armazenável no banco
@Table(name = "endereco") // torno explicito o nome da tabela

>>>>>>> e046d749d5f547409627cf1cec6ff89a2cd6dea8
public class Endereco {

	@Id 
	@Column(name = "IDendereco")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer IDendereco;

	@Column(name = "estado", length = 45, nullable = false)
	private String estado;

	@Column(name = "cidade", length = 45, nullable = false)
	private String cidade;
	
	@Column(name = "cep", length = 15, nullable = false, unique = true)
	private String cep;
	
	@Column(name = "rua", length = 45, nullable = true)
	private String rua;
	//interface generica do JPA
	//uma pessoa para varios ennderecos
	
	@OneToMany(mappedBy="cliente", cascade= CascadeType.REMOVE)
	//evita a recupeação de dados infinita
	@JsonIgnoreProperties("cliente")
	private List<Endereco> listaEndereco;
	
	//vinculando endereco que tem o seu cleinte vinculado
	@ManyToOne
<<<<<<< HEAD
	@JoinColumn(name = "cliente_IDcliente")
	@JsonIgnoreProperties("enderecos")
=======
	@JoinColumn(name = "cliente_codigo")
	@JsonIgnoreProperties("listaEndereco")
>>>>>>> e046d749d5f547409627cf1cec6ff89a2cd6dea8
	private Cliente cliente;

	
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
	

}