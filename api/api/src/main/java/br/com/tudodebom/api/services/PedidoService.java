package br.com.tudodebom.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tudodebom.api.model.ItemPedido;
import br.com.tudodebom.api.model.Pedido;
import br.com.tudodebom.api.repository.PedidoRepository;

@Service
public class PedidoService implements IPedido{

	@Autowired 
	PedidoRepository repo;
	
	@Autowired
	IProduto produtoService;
	
	@Override
	public Pedido inserirNovoPedido(Pedido pedido) {
		for(ItemPedido item: pedido.getItens()) {
			item.setPedido(pedido);
			
		}
		return repo.save(pedido);
	}

	@Override
	public Pedido recuperarPeloCodigo(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}


}
