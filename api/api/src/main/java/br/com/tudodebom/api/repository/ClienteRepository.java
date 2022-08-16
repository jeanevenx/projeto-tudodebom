package br.com.tudodebom.api.repository;



import org.springframework.data.repository.CrudRepository;

import br.com.tudodebom.api.model.Cliente;

/***
 * Mapeamento de todos as instruções  do mysql referente a chave primaria
/
 */

public interface ClienteRepository extends CrudRepository< Cliente,Integer>{
	
}
