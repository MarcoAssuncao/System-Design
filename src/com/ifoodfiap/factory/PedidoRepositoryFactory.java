package com.ifoodfiap.factory;

import com.ifoodfiap.repository.PedidoRepository;

public class PedidoRepositoryFactory {

	
	public PedidoRepository create() {
		return new PedidoRepository();
	}
}
