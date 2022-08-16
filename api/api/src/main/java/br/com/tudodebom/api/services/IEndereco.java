package br.com.tudodebom.api.services;

import java.util.ArrayList;

import br.com.tudodebom.api.model.Endereco;



public interface IEndereco {
	

	public ArrayList<Endereco> buscartodos();
	
	public Endereco recuperarPeloCodigo(Integer IDcliente);
	
	public Endereco cadastrarNovo(Endereco novo);

}
