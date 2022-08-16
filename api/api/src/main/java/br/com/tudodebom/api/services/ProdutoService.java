package br.com.tudodebom.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tudodebom.api.model.Produto;
import br.com.tudodebom.api.repository.ProdutoRepository;

@Service
public class ProdutoService implements IProduto{
	
	@Autowired 
	ProdutoRepository repo;

	@Override
	public ArrayList<Produto> recuperarProdutos() {
		return (ArrayList<Produto>) repo.findAll();
	}

	@Override
	public Produto recuperarPeloId(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Produto cadastrarProduto(Produto produto) {
		String tipo = produto.getTipo().toLowerCase();
		if(produto.getNome() != null) {
			if(tipo.equals("genérico")) {
				double desconto = produto.getPreco() * 0.2;
				produto.setDescontoValido(desconto);
			}else {
				produto.setDescontoValido(0.0);
			}
			
			return repo.save(produto);
		}
		return null;
	}

	@Override
	public Produto atualizarProduto(Produto produto) {
		String tipo = produto.getTipo().toLowerCase();
		if(produto.getCodigo() != null && produto.getNome() != null) {
			if(tipo.equals("genérico")) {
				double desconto = produto.getPreco() * 0.2;
				produto.setDescontoValido(desconto);
			}else {
				produto.setDescontoValido(0.0);
			}

			return repo.save(produto);
		}
		return null;
	}

	@Override
	public void excluirProduto(Integer id) {
		repo.deleteById(id);
		
	}
	
	
}
