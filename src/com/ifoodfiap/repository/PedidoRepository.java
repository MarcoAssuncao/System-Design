package com.ifoodfiap.repository;

import java.util.ArrayList;
import java.util.List;

import com.ifoodfiap.domain.Pedido;
import com.ifoodfiap.domain.SituacaoPedidoEnum;

public class PedidoRepository {

	private static final List<Pedido> listaPedidos = new ArrayList<Pedido>();
	
	
	public List<Pedido> findAll() {
		if(!listaPedidos.isEmpty()) {
			return listaPedidos;
		}
		return null;
	}
	
	public Pedido adicionarPedido(Pedido pedido) {
		if(pedido != null){
			listaPedidos.add(pedido);
			return retornaObjetoAdd(pedido.getNumero());
		}
		return null;
	}
	
	public Pedido atualizarPedido(Pedido pedido) {
		for(Pedido  pedidoAtual : listaPedidos) {
		       if(pedidoAtual.getSituacaoPedido() != pedido.getSituacaoPedido()
		    		   && pedido.getNumero().equals(pedidoAtual.getNumero())){
		    	   pedidoAtual = pedido;
		       }
		}
		return retornaObjetoAdd(pedido.getNumero());
	}
	
	public Pedido findBySituacaoPedidoSolicitado(Integer numeroPedido, SituacaoPedidoEnum situacao) {
		
		Pedido pedidoSearch = new Pedido();
		for(Pedido  pedido : listaPedidos) {
			if(pedido.getNumero().equals(numeroPedido) && pedido.getSituacaoPedido().equals(situacao)){
				pedidoSearch = pedido;
			}
		}
		return pedidoSearch;
	}
	
	private Pedido retornaObjetoAdd(Integer numeroPedido) {
		Pedido pedidoSearch = new Pedido();
		for(Pedido  pedido : listaPedidos) {
			if(pedido.getNumero().equals(numeroPedido)){
				pedidoSearch = pedido;
			}
		}
		return pedidoSearch;
	}
}
