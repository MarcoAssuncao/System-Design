package com.ifoodfiap.vo;

import java.io.Serializable;

public class PedidoSituacaoEntregaVO implements Serializable {

	private static final long serialVersionUID = -4654287231942776567L;
	
	private Integer numeroPedido;
	private String observacaoPedido;
	private String situacaoPedido;
	
	
	public Integer getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public String getObservacaoPedido() {
		return observacaoPedido;
	}
	public void setObservacaoPedido(String observacaoPedido) {
		this.observacaoPedido = observacaoPedido;
	}
	public String getSituacaoPedido() {
		return situacaoPedido;
	}
	public void setSituacaoPedido(String situacaoPedido) {
		this.situacaoPedido = situacaoPedido;
	}
}
