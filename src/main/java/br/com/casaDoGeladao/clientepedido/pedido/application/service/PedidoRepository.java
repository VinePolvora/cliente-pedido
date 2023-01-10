package br.com.casaDoGeladao.clientepedido.pedido.application.service;

import br.com.casaDoGeladao.clientepedido.pedido.domain.Pedido;

public interface PedidoRepository {
	Pedido salvaPedido(Pedido pedido);
}
