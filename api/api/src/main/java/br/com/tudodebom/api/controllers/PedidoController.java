package br.com.tudodebom.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tudodebom.api.model.Pedido;
import br.com.tudodebom.api.services.IPedido;

@RestController
public class PedidoController {
	
	@Autowired
	IPedido service;
	
	@GetMapping("/pedidos/{codigo}")
	public ResponseEntity<Pedido> buscarPedidoPeloCodigo(@PathVariable Integer codigo){
		
		Pedido pedido = service.recuperarPeloCodigo(codigo);
		if(pedido != null) {
			return ResponseEntity.ok(pedido);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("pedidos")
	public ResponseEntity<Pedido> inserirPedido(@RequestBody Pedido pedido){
		Pedido inserido = service.inserirNovoPedido(pedido);
		return ResponseEntity.ok(inserido);
	}

}
