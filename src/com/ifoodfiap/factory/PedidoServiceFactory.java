package com.ifoodfiap.factory;

import com.ifoodfiap.service.PedidoService;

public class PedidoServiceFactory {
	
	public PedidoService create() {
		 return new PedidoService();
	}
}
