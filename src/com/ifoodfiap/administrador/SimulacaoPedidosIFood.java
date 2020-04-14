package com.ifoodfiap.administrador;

public class SimulacaoPedidosIFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Testes para validar o MicroServi�o de Pedidos!");
       
       MockPedidoComSucesso mockSucesso = new MockPedidoComSucesso();
       mockSucesso.executarProcessoEntregaComSucesso();
       mockSucesso.monitorarPedidos();
       
       System.out.println("Rotinas para executar o cancelamento de um pedido!");
       MockPedidoCancelado mockCancelado = new MockPedidoCancelado();
       mockCancelado.executarProcessoEntregaCancelada();
       mockCancelado.monitorarPedidos();
	}

}
