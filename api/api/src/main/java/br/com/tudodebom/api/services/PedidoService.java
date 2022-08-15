package br.com.tudodebom.api.services;

import br.com.tudodebom.api.model.Pedido;
import br.com.tudodebom.api.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class PedidoService {

	
	private final PedidoRepository pedidoRepository = null;

    public Pedido salvar(Pedido pedido){
        return pedidoRepository.save(pedido);

    }

    public List<Pedido> listarTodos(){
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id){

        return pedidoRepository.findById(id);
    }

    public void deletar(Long id){

        pedidoRepository.deleteById(id);
    }
	
}
