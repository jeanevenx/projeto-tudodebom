package br.com.tudodebom.api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tudodebom.api.model.Cliente;
import br.com.tudodebom.api.services.ICliente;

@RestController
public class ClienteController {
	
	@Autowired
	ICliente service;
	
	
	@GetMapping("/clientes")
	public ArrayList<Cliente> recuperarTodos() {
		return service.buscartodos();
	}
	
	@GetMapping("/clientes/{IDcliente}")
	public ResponseEntity<Cliente> recuperarPeloId(@PathVariable Integer IDcliente) {
		
		Cliente resultado = service.buscarPeloId(IDcliente);
		if(resultado != null) {
			return ResponseEntity.ok(resultado);
		}
		
		return ResponseEntity.notFound().build();
		
	}
	
	@PostMapping("/clientes")
	public  ResponseEntity<Cliente> cadastrarCliente(Cliente dados) {
		Cliente resultado = service.criarDados(dados);
		
		if(resultado != null) {
			return ResponseEntity.ok(resultado);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/clientes")
	public ResponseEntity<Cliente> alterarDados(Cliente novo) {
		Cliente resultado = service.atualizarDados(novo);
		
		if(resultado != null) {
			return ResponseEntity.ok(resultado);
		}
		
		return ResponseEntity.badRequest().build();
	}
	

}
