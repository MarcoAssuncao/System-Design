package com.ifoodfiap.vo;

import java.io.Serializable;

public class ProdutoSolicitadoVO implements Serializable {
	
	private static final long serialVersionUID = 2141200766701332901L;
	
	private Integer codigoProduto;
	private String nomeProduto;
	private Integer cnpjEstabelecimento;
	private Double  preco;
	
	public Integer getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(Integer codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Integer getCnpjEstabelecimento() {
		return cnpjEstabelecimento;
	}
	public void setCnpjEstabelecimento(Integer cnpjEstabelecimento) {
		this.cnpjEstabelecimento = cnpjEstabelecimento;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
