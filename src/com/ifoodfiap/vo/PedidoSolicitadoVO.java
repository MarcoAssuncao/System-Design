package com.ifoodfiap.vo;

import java.io.Serializable;
import java.util.List;

public class PedidoSolicitadoVO implements Serializable {


	private static final long serialVersionUID = -6885775160996989899L;

	private ClienteIFoodVO cliente;
	
	private String cnpjEstabelecimento;
	private String nomeEstabelecimento;

	private String status;
	
	private String dataEntrega;
	
	private String enderecoEntrega;
	
	private List<ProdutoSolicitadoVO> produtos;
	
	private String observacoes;

	public ClienteIFoodVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteIFoodVO cliente) {
		this.cliente = cliente;
	}
	
	public String getCnpjEstabelecimento() {
		return cnpjEstabelecimento;
	}

	public void setCnpjEstabelecimento(String cnpjEstabelecimento) {
		this.cnpjEstabelecimento = cnpjEstabelecimento;
	}

	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}



	public List<ProdutoSolicitadoVO> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoSolicitadoVO> produtos) {
		this.produtos = produtos;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
}
