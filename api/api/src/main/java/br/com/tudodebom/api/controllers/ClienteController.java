
package br.com.tudodebom.api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tudodebom.api.model.Cliente;
import br.com.tudodebom.api.repository.ClienteRepository;

@RestController
public class ClienteController {

	/***
	 * No controller será criada as classes que tem os métodos que será permitido
	 * relizar o crud sendo assim aplicado os endpoints /
	 */
	@Autowired //faço a inseção de depencias
	//vai pegar a definição de uma classe e gerar todos os sqls
	private ClienteRepository repository;

	@GetMapping("/cliente")
	public ArrayList<Cliente> recuperarTodos() {
		
		ArrayList<Cliente> lista;
		//converção forçada de uma interface "repository" apra um arrray
		lista = (ArrayList<Cliente>) repository.findAll();	
		
		return lista;
	}

}

