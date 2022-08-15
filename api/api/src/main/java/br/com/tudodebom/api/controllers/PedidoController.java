package br.com.tudodebom.api.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.tudodebom.api.model.Pedido;
import br.com.tudodebom.api.services.PedidoService;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/pedido")


public class PedidoController {
				
	
	
	private final PedidoService service = new PedidoService();
    

	@GetMapping
    public ResponseEntity<List<Pedido>>  listarTodos(){

        List<Pedido> pedido = service.listarTodos();
        return ResponseEntity.status(HttpStatus.OK).body(pedido);

    }
	 @GetMapping("/{id}")
	    public ResponseEntity<Pedido>  buscarPorId(@PathVariable Long id){

	        Optional<Pedido> PedidoOptional = service.buscarPorId(id);

	        if(PedidoOptional.isEmpty()) {

	            return ResponseEntity.notFound().build();
	        }
	        return ResponseEntity.status(HttpStatus.OK).body(PedidoOptional.get());

	    }
  
}
