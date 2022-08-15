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

import br.com.tudodebom.api.model.Produto;
import br.com.tudodebom.api.services.IProduto;

@RestController
public class ProdutoController {
	
	@Autowired
	IProduto service;
	
	@GetMapping("/produtos")
	public ArrayList<Produto> getAll(){
		return service.recuperarProdutos();
		
	}
	
	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> getById(@PathVariable Integer id){
		Produto res = service.recuperarPeloId(id);
		
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.status(404).build();
				
	}
	@PostMapping("/produtos")
	public ResponseEntity<Produto> criar(@RequestBody Produto novo){
		Produto res = service.cadastrarProduto(novo);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/produtos")
	public ResponseEntity<Produto> atualizar(@RequestBody Produto produto){
		
		Produto atualizado = service.atualizarProduto(produto);
		
		if(atualizado != null) {
			return ResponseEntity.ok(atualizado);
		}
		return ResponseEntity.badRequest().build();
		
	}
	
	@DeleteMapping("/produtos/{id}")
	public ResponseEntity<Produto> excluir(@PathVariable Integer id){
		Produto produto = service.recuperarPeloId(id);
		
		if(produto != null) {
			service.excluirProduto(id);
			return ResponseEntity.ok(produto);
		}
		
		return ResponseEntity.notFound().build();
	}
	

}
