package br.com.tudodebom.api.services;

import java.util.ArrayList;

import br.com.tudodebom.api.model.Produto;

public interface IProduto {
	public ArrayList<Produto> recuperarProdutos();
	public Produto recuperarPeloId(Integer id);
	public Produto cadastrarProduto(Produto novo);
	public Produto atualizarProduto(Produto produto);
	public void excluirProduto(Integer id);

}
