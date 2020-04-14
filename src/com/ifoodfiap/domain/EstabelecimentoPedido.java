package com.ifoodfiap.domain;

import java.io.Serializable;

public class EstabelecimentoPedido implements Serializable {

	private static final long serialVersionUID = 5928399659035528016L;
	
	private String cnpjEstabelecimento;
	private String nomeEstabelecimento;
	
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
	
	@Override
	public String toString() {
		return "EstabelecimentoPedido [cnpjEstabelecimento="
				+ cnpjEstabelecimento + ", nomeEstabelecimento="
				+ nomeEstabelecimento + "]";
	}
	
	
	
}
