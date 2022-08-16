package br.com.tudodebom.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tudodebom.api.model.Endereco;
import br.com.tudodebom.api.repository.EnderecoRepository;
@Service
public class EnderecoService implements IEndereco{
	@Autowired // ingeção direto no banco
	EnderecoRepository repository;
	
	@Override
	public Endereco criarDados(Endereco dados) {
		// TODO Auto-generated method stub
		return repository.save(dados);
		
	}

	@Override
	public ArrayList<Endereco> buscartodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Endereco>) repository.findAll();
	}

	@Override
	public Endereco buscarPeloId(Integer IDcliente) {
		// TODO Auto-generated method stub
		return repository.findById(IDcliente).orElse(null);
	}

}
