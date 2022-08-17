
package br.com.tudodebom.api.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tudodebom.api.model.Cliente;
import br.com.tudodebom.api.repository.ClienteRepository;
import br.com.tudodebom.api.services.ClienteService;

@RestController
public class ClienteController {

	
	@Autowired 
	private ClienteService service;

	@GetMapping("/cliente")
	public ArrayList<Cliente> recuperarTodos() {

		return service.buscartodos();
	}

	@PostMapping("/cliente") 
	public ResponseEntity<Cliente> incluirNovo(@Valid @RequestBody Cliente novo) {
		Cliente res = service.criarDados(novo);
		
		if (res == null) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(res);

	}

	@PutMapping("/cliente")
	public ResponseEntity<Cliente> alterar(@RequestBody Cliente dados) {

		Cliente res = service.atualizarDados(dados);

		if (res != null) {

			return ResponseEntity.ok(res);

		}

		return ResponseEntity.badRequest().build();

	}


	@DeleteMapping("/cliente/{IDcliente}")
	public ResponseEntity<Cliente> excluirCliente(@PathVariable Integer IDcliente) {

		service.excluirCliente(IDcliente);
		return ResponseEntity.ok(null);

	}

	@GetMapping("/cliente/{IDcliente}")
	public ResponseEntity<Cliente> encontrarPeloId(@PathVariable Integer IDcliente) {

		Cliente res = service.buscarPeloId(IDcliente);

		if (res != null) {

			return ResponseEntity.ok(res);

		}

		return ResponseEntity.notFound().build();

	}

}
