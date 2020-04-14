package com.ifoodfiap.vo;

import java.io.Serializable;

public class RetornoSolicitacaoPedidoVO implements Serializable {


	private static final long serialVersionUID = -9029888938835141711L;
	
	private String numeroPedido;
	private String situacaoPedido;
	
	
	public String getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public String getSituacaoPedido() {
		return situacaoPedido;
	}
	public void setSituacaoPedido(String situacaoPedido) {
		this.situacaoPedido = situacaoPedido;
	}
	
	
}
