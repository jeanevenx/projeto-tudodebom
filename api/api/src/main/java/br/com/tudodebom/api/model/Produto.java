package br.com.tudodebom.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo", nullable = false)
	private Integer codigo; 
	
	public Double getDescontoValido() {
		return DescontoValido;
	}
	public void setDescontoValido(Double descontoValido) {
		DescontoValido = descontoValido;
	}
	@Column(name="nome", length=60, nullable = true)
	private String nome;
	
	@Column(name="descricao", columnDefinition = "TEXT", nullable = true)
	private String descricao; 
	
	@Column(name="preco", nullable = false)
	private Double preco; 
	
	@Column(name="desconto_valido", nullable = true)
	private Double DescontoValido;
	
	@Column(name="estoque", nullable = false)
	private Integer estoque;  
	
	@Column(name="tipo", nullable = true)
	private String tipo;
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	} 
	
	
}
