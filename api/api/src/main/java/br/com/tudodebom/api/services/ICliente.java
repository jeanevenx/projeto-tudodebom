package br.com.tudodebom.api.services;

import java.util.ArrayList;

import br.com.tudodebom.api.model.Cliente;

public interface ICliente {
	//passar os dados para um novo cliente
	//e deve ser retornado se for criado ou n
	public Cliente criarNovo(Cliente novo);
	
	public Cliente criarDados(Cliente dados);
	
	public ArrayList<Cliente> buscartodos();
	
	public Cliente buscarPeloId(Integer IDcliente);
	
	public void excluirDepartamento(Integer IDcliente);
	

}
