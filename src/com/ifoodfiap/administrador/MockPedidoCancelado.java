package com.ifoodfiap.administrador;

import java.util.ArrayList;
import java.util.List;

import com.ifoodfiap.controller.PedidoController;
import com.ifoodfiap.domain.Pedido;
import com.ifoodfiap.domain.ProdutoEstabelecimento;
import com.ifoodfiap.vo.ClienteIFoodVO;
import com.ifoodfiap.vo.PedidoSituacaoEntregaVO;
import com.ifoodfiap.vo.PedidoSolicitadoVO;
import com.ifoodfiap.vo.ProdutoSolicitadoVO;
import com.ifoodfiap.vo.RetornoSolicitacaoPedidoVO;

public class MockPedidoCancelado {

	private PedidoController pedidoController;

	public MockPedidoCancelado() {
		pedidoController = new PedidoController();
	}

	public void executarProcessoEntregaCancelada() {

		RetornoSolicitacaoPedidoVO solicitarPedidoIfood = pedidoController.solicitarPedidoIfood(criarObjeto());
		System.out.println("Cliente apresenta a solicitacao do pedido!"
				+ solicitarPedidoIfood.getNumeroPedido() + "\t "
				+ solicitarPedidoIfood.getSituacaoPedido());
		
		PedidoSituacaoEntregaVO pedidoSituacao = new PedidoSituacaoEntregaVO();
		
		pedidoSituacao.setNumeroPedido(Integer.valueOf(solicitarPedidoIfood.getNumeroPedido()));
		pedidoSituacao.setSituacaoPedido(solicitarPedidoIfood.getSituacaoPedido());

		RetornoSolicitacaoPedidoVO cancelarPedidoCliente = pedidoController.cancelarPedidoIfood(pedidoSituacao);
		System.out.println("Cliente solicita o cancelamento do pedido!"
				+ cancelarPedidoCliente.getNumeroPedido() + "\t "
				+ cancelarPedidoCliente.getSituacaoPedido());

	}
	
	
	public void monitorarPedidos() {
		List<Pedido> listarTodos = pedidoController.findAll();
		
		for(Pedido pedido : listarTodos){
			System.out.println("Pedido: "+  pedido.getNumero());
			System.out.println("Cliente: "+  pedido.getCliente().getNomeCliente());
			System.out.println("Situa��o: "+  pedido.getSituacaoPedido().name());
			System.out.println("Refei��es"+  pedido.getProdutos().size());
			for(ProdutoEstabelecimento produto : pedido.getProdutos()) {
				System.out.println("Prato: "+  produto.getNomeProduto());
				System.out.println("Pre�o: "+  produto.getPreco());
				System.out.println("Codigo Produto: "+  produto.getId());
			}
		}
	}


	private PedidoSolicitadoVO criarObjeto() {

		PedidoSolicitadoVO pedidoVO = new PedidoSolicitadoVO();
		pedidoVO.setCliente(criarObjetoCliente());
		pedidoVO.setCnpjEstabelecimento("789744644446546");
		pedidoVO.setNomeEstabelecimento("Churrascaria Freio de Ouro");
		pedidoVO.setStatus(null);
		pedidoVO.setDataEntrega("25-12-2020");
		pedidoVO.setProdutos(criarListProdutos());

		return pedidoVO;
	}

	private List<ProdutoSolicitadoVO> criarListProdutos() {
		List<ProdutoSolicitadoVO> produtos = new ArrayList<>();
		ProdutoSolicitadoVO produto = new ProdutoSolicitadoVO();
		produto.setCnpjEstabelecimento(87979797);
		produto.setNomeProduto("Massa Penny");
		produto.setPreco(18.90);
		produto.setCodigoProduto(15);
		produtos.add(produto);

		ProdutoSolicitadoVO produto2 = new ProdutoSolicitadoVO();
		produto2.setCnpjEstabelecimento(87979797);
		produto2.setNomeProduto("Maminha com tomates secos");
		produto2.setPreco(35.90);
		produto2.setCodigoProduto(2);
		produtos.add(produto2);

		ProdutoSolicitadoVO produto3 = new ProdutoSolicitadoVO();
		produto3.setCnpjEstabelecimento(87979797);
		produto3.setNomeProduto("Salada Caeser");
		produto3.setPreco(27.90);
		produto3.setCodigoProduto(9);
		produtos.add(produto3);
		
		ProdutoSolicitadoVO produto4 = new ProdutoSolicitadoVO();
		produto4.setCnpjEstabelecimento(87979797);
		produto4.setNomeProduto("Coracao de frango");
		produto4.setPreco(27.90);
		produto4.setCodigoProduto(11);
		produtos.add(produto4);
		return produtos;
	}

	private ClienteIFoodVO criarObjetoCliente() {
		ClienteIFoodVO cliente = new ClienteIFoodVO();
		cliente.setCpfCliente("451146478");
		cliente.setNomeCliente("Jo�o Guilherme da Silva");
		return cliente;
	}
}
