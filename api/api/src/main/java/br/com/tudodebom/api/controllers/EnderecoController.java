package br.com.tudodebom.api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	

}
