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

import br.com.tudodebom.api.model.Cliente;
import br.com.tudodebom.api.model.Endereco;
import br.com.tudodebom.api.services.IEndereco;

@RestController
public class EnderecoController {

	/***
	 * No controller será criada as classes que tem os métodos que será permitido
	 * relizar o crud sendo assim aplicado os endpoints /
	 */
	
	
	@Autowired //faço a inceção de depencias
	//vai pegar a definição de uma classe e gerar todos os sqls
	private IEndereco service;
	//recuperar todo mundo
	@GetMapping("/endereco")
	public ArrayList<Endereco> recuperarTodos() {
		
		return service.buscartodos();
		
		
	}
	
	@GetMapping("/endereco/{IDendereco}")
	public ResponseEntity<Endereco> encontrarPeloId(@PathVariable Integer IDendereco) {

		Endereco res = service.recuperarPeloCodigo(IDendereco);

		if (res != null) {

			return ResponseEntity.ok(res);

		}

		return ResponseEntity.status(404).build();

	}	
	
	
	//cadastrar
	@PostMapping("/endereco")
	public ResponseEntity<Endereco> incerirNovoProduto(@RequestBody Endereco Novo) {
		
		Endereco res = service.cadastrarNovo(Novo);
		if (res != null) {

			return ResponseEntity.ok(res);

		}

		return ResponseEntity.badRequest().build();

	}

}
