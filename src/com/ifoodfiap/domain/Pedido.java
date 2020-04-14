package com.ifoodfiap.domain;

import java.io.Serializable;
import java.util.List;

public class Pedido implements Serializable {

	private static final long serialVersionUID = -113795194213044119L;
	
	private Integer numero;
	private EstabelecimentoPedido estabelecimento;
	private List<ProdutoEstabelecimento> produtos;
	private ClientePedido cliente;
	private SituacaoPedidoEnum situacaoPedido;
	private String observacoes;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public EstabelecimentoPedido getEstabelecimento() {
		return estabelecimento;
	}
	public void setEstabelecimento(EstabelecimentoPedido estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	
	public List<ProdutoEstabelecimento> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<ProdutoEstabelecimento> produtos) {
		this.produtos = produtos;
	}
	
	public ClientePedido getCliente() {
		return cliente;
	}
	public void setCliente(ClientePedido cliente) {
		this.cliente = cliente;
	}
	public SituacaoPedidoEnum getSituacaoPedido() {
		return situacaoPedido;
	}
	public void setSituacaoPedido(SituacaoPedidoEnum situacaoPedido) {
		this.situacaoPedido = situacaoPedido;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", estabelecimento="
				+ estabelecimento + ", produtos=" + produtos + ", cliente="
				+ cliente + ", situacaoPedido=" + situacaoPedido
				+ ", observacoes=" + observacoes + "]";
	}

}
