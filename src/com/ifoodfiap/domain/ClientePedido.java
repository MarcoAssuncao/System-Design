package com.ifoodfiap.domain;

import java.io.Serializable;

public class ClientePedido implements Serializable {

	private static final long serialVersionUID = 7441594887260742857L;
	
	private String cpfCliente;
	private String nomeCliente;
	private String telefoneCliente;
	
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
	
	@Override
	public String toString() {
		return "ClientePedido [cpfCliente=" + cpfCliente + ", nomeCliente="
				+ nomeCliente + ", telefoneCliente=" + telefoneCliente
				+ ", getCpfCliente()=" + getCpfCliente()
				+ ", getNomeCliente()=" + getNomeCliente()
				+ ", getTelefoneCliente()=" + getTelefoneCliente()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
