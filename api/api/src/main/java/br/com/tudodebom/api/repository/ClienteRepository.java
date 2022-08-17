package br.com.tudodebom.api.repository;
	


import org.springframework.data.repository.CrudRepository;

import br.com.tudodebom.api.model.Cliente;


public interface ClienteRepository extends CrudRepository< Cliente,Integer>{
	
}
