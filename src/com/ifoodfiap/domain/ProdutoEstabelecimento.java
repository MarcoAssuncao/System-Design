package com.ifoodfiap.domain;

import java.io.Serializable;

public class ProdutoEstabelecimento implements  Serializable {
	
	
	private static final long serialVersionUID = 8522774695908426003L;
	
	private Integer id;
	private String nomeProduto;
	private Double preco;
	private Integer quantidade;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	@Override
	public String toString() {
		return "ProdutoEstabelecimento [id=" + id + ", nomeProduto="
				+ nomeProduto + ", preco=" + preco + ", quantidade="
				+ quantidade + "]";
	}

}
