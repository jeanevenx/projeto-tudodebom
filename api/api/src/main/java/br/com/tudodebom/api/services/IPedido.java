package br.com.tudodebom.api.services;

import br.com.tudodebom.api.model.Pedido;

public interface IPedido {
	public Pedido inserirNovoPedido(Pedido pedido);
	public Pedido recuperarPeloCodigo(Integer codigo);

}
