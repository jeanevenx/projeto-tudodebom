package br.com.tudodebom.api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import br.com.tudodebom.api.model.Endereco;
import br.com.tudodebom.api.services.IEndereco;



@RestController
public class EnderecoController {
	
	@Autowired 
	private IEndereco service;
	
	@GetMapping("/endereco")
	public ArrayList<Endereco> recuperarTodos() {

		return service.buscartodos();
	}
	
	@GetMapping("/endereco/{IDendereco}")
	public ResponseEntity<Endereco>RecuperarPeloId(@PathVariable Integer IDendereco){
		Endereco res = service.buscarPeloId(IDendereco);
		if(res!=null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.status(404).build();
	}
	
	@PostMapping("/endereco")
	public ResponseEntity<Endereco>CadastrarNovo(@RequestBody Endereco novo){
		Endereco res = service.criarDados(novo);
		if(res!=null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/endereco/{IDendereco}")
	public ResponseEntity<Endereco> excluirCliente(@PathVariable Integer IDendereco) {

		service.excluirCliente(IDendereco);
		return ResponseEntity.ok(null);

	}
		
	}
	


