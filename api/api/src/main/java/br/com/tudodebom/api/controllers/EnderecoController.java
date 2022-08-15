package br.com.tudodebom.api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tudodebom.api.model.Endereco;
import br.com.tudodebom.api.repository.EnderecoRepository;

@RestController
public class EnderecoController {

	/***
	 * No controller será criada as classes que tem os métodos que será permitido
	 * relizar o crud sendo assim aplicado os endpoints /
	 */
	@Autowired //faço a inceção de depencias
	//vai pegar a definição de uma classe e gerar todos os sqls
	private EnderecoRepository repository;

	@GetMapping("/endereco")
	public ArrayList<Endereco> recuperarTodos() {
		
		ArrayList<Endereco> lista;
		//converção forçada de uma interface "repository" apra um arrray
		lista = (ArrayList<Endereco>) repository.findAll();	
		
		return lista;
	}

}
