package com.ifoodfiap.event;

import com.ifoodfiap.domain.Pedido;
import com.ifoodfiap.vo.RetornoSolicitacaoPedidoVO;

public class MessageEvent {
	
	public RetornoSolicitacaoPedidoVO messagemRetorno(Pedido pedido){
		RetornoSolicitacaoPedidoVO retorno = new RetornoSolicitacaoPedidoVO();
		retorno.setNumeroPedido(pedido.getNumero().toString());
		retorno.setSituacaoPedido(pedido.getSituacaoPedido().name());
		return retorno;
	}

}
