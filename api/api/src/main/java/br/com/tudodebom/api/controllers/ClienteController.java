
package br.com.tudodebom.api.controllers;

import java.util.ArrayList;

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

	/***
	 * No controller será criada as classes que tem os métodos que será permitido
	 * relizar o crud sendo assim aplicado os endpoints /
	 */
	@Autowired //faço a inseção de depencias
	//vai pegar a definição de uma classe e gerar todos os sqls
	private ClienteService service;

	@GetMapping("/cliente")
	public ArrayList<Cliente> recuperarTodos() {
		
		return service.buscartodos();
	}
	@GetMapping("/cliente/{codigo}")
	public ResponseEntity<Cliente> buscarPeloId(@PathVariable Integer codigo){
		Cliente res = service.buscarPeloId(codigo);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/cliente")
	public ResponseEntity<Cliente> incluirNovo (@RequestBody Cliente novo) {
		Cliente res = service.criarDados(novo);
	if(res==null) {
		return ResponseEntity.badRequest().build();
	}
	return ResponseEntity.ok(res);
	
	}
	@PutMapping("/cliente")
	public ResponseEntity<Cliente> alterar(@RequestBody Cliente dados){
		
		Cliente res = service.atualizarDados(dados);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest(). build();
	}
	
	@DeleteMapping("/cliente/{id}")
	public ResponseEntity<Cliente> excluirCliente(@PathVariable Integer id){
		service.excluirCliente(id);
		return ResponseEntity.ok(null);
	}

}

