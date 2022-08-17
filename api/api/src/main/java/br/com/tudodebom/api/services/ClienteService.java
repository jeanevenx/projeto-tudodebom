package br.com.tudodebom.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tudodebom.api.model.Cliente;
import br.com.tudodebom.api.model.Endereco;
import br.com.tudodebom.api.repository.ClienteRepository;

@Service
public class ClienteService implements ICliente {

	@Autowired
	ClienteRepository repository;

	

	@Override
	public Cliente criarDados(Cliente novo) {
		for (Endereco endereco: novo.getEnderecos()) {
		endereco.setCliente(novo);
	}
		return repository.save(novo);
		
	}

	@Override
	public ArrayList<Cliente> buscartodos() {
		return (ArrayList<Cliente>) repository.findAll();
	}
	
	@Override
	public Cliente buscarPeloId(Integer IDcliente) {
		
		return repository.findById(IDcliente).orElse(null);
	}

	@Override
	public void excluirCliente(Integer IDcliente) {

		repository.deleteById(IDcliente);

	}

	@Override
	public Cliente atualizarDados(Cliente dados) {
		for (Endereco endereco: dados.getEnderecos()) {
			endereco.setCliente(dados);
		}
		if(dados.getNome() != null && dados.getIdCliente() != null) {
			return repository.save(dados);
		}
		
		return null;
	}

}
