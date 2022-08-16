package br.com.tudodebom.api.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tudodebom.api.model.Endereco;
import br.com.tudodebom.api.repository.EnderecoRepository;

@Service
public class EnderecoService implements IEndereco {
	@Autowired
	private EnderecoRepository repository;

	@Override
	public ArrayList<Endereco> buscartodos() {
		// TODO Auto-generated method stub

		return (ArrayList<Endereco>) repository.findAll();
	}

	@Override
	public Endereco recuperarPeloCodigo(Integer cliente_codigo) {
		// TODO Auto-generated method stub
		return repository.findById(cliente_codigo).orElse(null);
	}

	@Override
	public Endereco cadastrarNovo(Endereco novo) {
		// TODO Auto-generated method stub
		return repository.save(novo);
	}

}
