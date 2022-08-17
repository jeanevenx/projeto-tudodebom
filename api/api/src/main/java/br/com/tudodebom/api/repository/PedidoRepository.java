package br.com.tudodebom.api.repository;


import org.springframework.data.repository.CrudRepository;

import br.com.tudodebom.api.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Integer>{
	

}
