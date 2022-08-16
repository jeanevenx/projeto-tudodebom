package br.com.tudodebom.api.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tudodebom.api.model.Endereco;

/***
 * Mapeamento de todos as instruções  do mysql referente a chave primaria
/
 */

public interface EnderecoRepository extends CrudRepository< Endereco,Integer>{
	
	
}
