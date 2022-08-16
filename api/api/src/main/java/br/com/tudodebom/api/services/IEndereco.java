package br.com.tudodebom.api.services;

import java.util.ArrayList;

import br.com.tudodebom.api.model.Endereco;

public interface IEndereco {
	
public Endereco criarDados(Endereco dados);
	
	
	public ArrayList<Endereco> buscartodos();
	
	public Endereco buscarPeloId(Integer IDcliente);

}
