package com.ifoodfiap.controller;

import java.util.List;

import com.ifoodfiap.domain.Pedido;
import com.ifoodfiap.factory.PedidoServiceFactory;
import com.ifoodfiap.vo.PedidoSituacaoEntregaVO;
import com.ifoodfiap.vo.PedidoSolicitadoVO;
import com.ifoodfiap.vo.RetornoSolicitacaoPedidoVO;

public class PedidoController {

	private PedidoServiceFactory pedidoServiceFactory;

	public PedidoController() {
		pedidoServiceFactory = new PedidoServiceFactory();
	}

	public RetornoSolicitacaoPedidoVO solicitarPedidoIfood(PedidoSolicitadoVO pedidoSolicitado) {

		return pedidoServiceFactory.create().solicitarPedido(pedidoSolicitado);
	}

	public RetornoSolicitacaoPedidoVO enviarPedidoIfoodByCliente(PedidoSituacaoEntregaVO pedidoSituacaoEntregaVO) {

		return pedidoServiceFactory.create().entregarPedido(pedidoSituacaoEntregaVO);
	}

	public RetornoSolicitacaoPedidoVO cancelarPedidoIfood(PedidoSituacaoEntregaVO pedidoSituacaoEntregaVO) {

		return pedidoServiceFactory.create().cancelarPedido(pedidoSituacaoEntregaVO);
	}

	public RetornoSolicitacaoPedidoVO realizarBaixaEntregaPedido(PedidoSituacaoEntregaVO pedidoSituacaoEntregaVO) {
		return pedidoServiceFactory.create().realizarBaixaEntrega(pedidoSituacaoEntregaVO);
	}
	
	public List<Pedido> findAll() {
		return pedidoServiceFactory.create().findAll();
	}
}
