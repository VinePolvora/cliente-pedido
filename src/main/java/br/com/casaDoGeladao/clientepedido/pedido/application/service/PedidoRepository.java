package br.com.casaDoGeladao.clientepedido.pedido.application.service;

import java.util.List;
import java.util.UUID;

import br.com.casaDoGeladao.clientepedido.pedido.domain.Pedido;

public interface PedidoRepository {
	Pedido salvaPedido(Pedido pedido);
	List<Pedido> buscaPedidosDoClienteComId(UUID idCliente);
	Pedido buscaPedidoPeloId(UUID idPedido);
	void deletaPedido(Pedido pedido);
}
