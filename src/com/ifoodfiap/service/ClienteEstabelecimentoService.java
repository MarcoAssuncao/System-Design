package com.ifoodfiap.service;

import com.ifoodfiap.domain.ClientePedido;
import com.ifoodfiap.domain.EstabelecimentoPedido;
import com.ifoodfiap.vo.ClienteIFoodVO;
import com.ifoodfiap.vo.PedidoSolicitadoVO;

public class ClienteEstabelecimentoService {

	protected ClientePedido createCliente(ClienteIFoodVO clienteVO) {
		ClientePedido cliente = new ClientePedido();
		cliente.setCpfCliente(clienteVO.getCpfCliente());
		cliente.setNomeCliente(clienteVO.getNomeCliente());
		cliente.setTelefoneCliente(null);
		return cliente;
	}
	
	protected EstabelecimentoPedido createEstabelecimento(PedidoSolicitadoVO pedidoVO){
		EstabelecimentoPedido estabelecimento = new EstabelecimentoPedido();
		estabelecimento.setNomeEstabelecimento(pedidoVO.getNomeEstabelecimento());
		estabelecimento.setCnpjEstabelecimento(pedidoVO.getCnpjEstabelecimento());
		return estabelecimento;
	}
}
