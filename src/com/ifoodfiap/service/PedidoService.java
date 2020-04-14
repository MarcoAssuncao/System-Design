package com.ifoodfiap.service;

import java.util.List;
import java.util.Random;

import com.ifoodfiap.domain.Pedido;
import com.ifoodfiap.domain.SituacaoPedidoEnum;
import com.ifoodfiap.event.MessageEvent;
import com.ifoodfiap.factory.PedidoRepositoryFactory;
import com.ifoodfiap.vo.PedidoSituacaoEntregaVO;
import com.ifoodfiap.vo.PedidoSolicitadoVO;
import com.ifoodfiap.vo.RetornoSolicitacaoPedidoVO;

public class PedidoService {

	private ProdutoEstabelecimentoService produtoService;
	private ClienteEstabelecimentoService clienteEstabelecimentoService;
	private PedidoRepositoryFactory pedidoRepository;
	private MessageEvent event;
	
	public PedidoService() {
		pedidoRepository = new PedidoRepositoryFactory();
		produtoService = new ProdutoEstabelecimentoService();
		clienteEstabelecimentoService = new ClienteEstabelecimentoService();
		event = new MessageEvent();
	}
	
	public RetornoSolicitacaoPedidoVO solicitarPedido(PedidoSolicitadoVO pedidoVO) {	
		Pedido pedidoSaved = pedidoRepository.create().adicionarPedido(create(pedidoVO));
		return event.messagemRetorno(pedidoSaved);
	}
	
	public RetornoSolicitacaoPedidoVO entregarPedido(PedidoSituacaoEntregaVO pedidoSituacaoVO) {
		Pedido pedidoRetorno = pedidoRepository
		.create()
		.findBySituacaoPedidoSolicitado(pedidoSituacaoVO.getNumeroPedido(), SituacaoPedidoEnum.SOLICITADO_CLIENTE);
		pedidoRetorno.setSituacaoPedido(SituacaoPedidoEnum.PRONTO_ENTREGA);
		Pedido pedidoAtualizado = pedidoRepository.create().atualizarPedido(pedidoRetorno);
		return event.messagemRetorno(pedidoAtualizado);
	}
	
	public RetornoSolicitacaoPedidoVO cancelarPedido(PedidoSituacaoEntregaVO pedidoSituacaoVO) {	
		Pedido pedidoRetorno = pedidoRepository
		.create().findBySituacaoPedidoSolicitado(pedidoSituacaoVO.getNumeroPedido(), SituacaoPedidoEnum.SOLICITADO_CLIENTE);
		pedidoRetorno.setSituacaoPedido(SituacaoPedidoEnum.CANCELADO);
		Pedido pedidoAtualizado = pedidoRepository.create().atualizarPedido(pedidoRetorno);
		return event.messagemRetorno(pedidoAtualizado);
	}
	
	public RetornoSolicitacaoPedidoVO realizarBaixaEntrega(PedidoSituacaoEntregaVO pedidoSituacaoVO) {
		Pedido pedidoRetorno = pedidoRepository.create()
				.findBySituacaoPedidoSolicitado(pedidoSituacaoVO.getNumeroPedido(),SituacaoPedidoEnum.PRONTO_ENTREGA);
		
		pedidoRetorno.setSituacaoPedido(SituacaoPedidoEnum.ENTREGA_REALIZADA);
		Pedido pedidoAtualizado = pedidoRepository.create().atualizarPedido(pedidoRetorno);
		return event.messagemRetorno(pedidoAtualizado);
	}
	
	public List<Pedido> findAll() {
		return pedidoRepository.create().findAll();
	}
	
	private Pedido create(PedidoSolicitadoVO pedidoVO) {
		Pedido pedido = new Pedido();
		pedido.setNumero(new Random().nextInt());
		pedido.setCliente(clienteEstabelecimentoService.createCliente(pedidoVO.getCliente()));
		pedido.setEstabelecimento(clienteEstabelecimentoService.createEstabelecimento(pedidoVO));
		pedido.setSituacaoPedido(SituacaoPedidoEnum.SOLICITADO_CLIENTE);
		pedido.setProdutos(produtoService.convertListToEntities(pedidoVO.getProdutos()));
		pedido.setObservacoes(pedidoVO.getObservacoes());
		return pedido;
	}
}
