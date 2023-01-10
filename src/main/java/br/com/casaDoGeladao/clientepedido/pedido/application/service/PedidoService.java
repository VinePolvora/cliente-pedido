package br.com.casaDoGeladao.clientepedido.pedido.application.service;

import java.util.List;
import java.util.UUID;

import br.com.casaDoGeladao.clientepedido.pedido.application.api.PedidoClienteListResponse;
import br.com.casaDoGeladao.clientepedido.pedido.application.api.PedidoRequest;
import br.com.casaDoGeladao.clientepedido.pedido.application.api.PedidoResponse;
import jakarta.validation.Valid;

public interface PedidoService {
	PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest);
	List<PedidoClienteListResponse> buscaPedidosDoClienteComId(UUID idCliente);
}
