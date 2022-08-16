package br.com.tudodebom.api.services;

import java.util.ArrayList;

import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tudodebom.api.model.Cliente;
import br.com.tudodebom.api.repository.ClienteRepository;

@Service
public class ClienteService implements ICliente {

	@Autowired // ingeção direto no banco
	ClienteRepository repository;

	

	@Override
	
	public Cliente criarDados(Cliente novo) {
		// TODO Auto-generated method stub
		
		
		if (novo.getNome() != null) {
			return repository.save(novo);
		}

		return null;
	}

	@Override
	public ArrayList<Cliente> buscartodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Cliente>) repository.findAll();
	}

	@Override
	public Cliente atualizarDados(Cliente dados) {
		// TODO Auto-generated method stub

		if (dados.getIDcliente()!= null && dados.getNome()!= null){
			
			return repository.save(dados);

		}
		return null;

	}
	@Override
	public Cliente buscarPeloId(Integer IDcliente) {
		// TODO Auto-generated method stub
		// auto incremento
		return repository.findById(IDcliente).orElse(null);
	}

	@Override
	public void excluirCliente(Integer IDcliente) {
		// TODO Auto-generated method stub
		repository.deleteById(IDcliente);

	}

}
