package br.com.tudodebom.api.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tudodebom.api.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
}
