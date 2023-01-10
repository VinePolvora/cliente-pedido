package br.com.casaDoGeladao.clientepedido.pedido.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.casaDoGeladao.clientepedido.pedido.domain.Pedido;
import br.com.casaDoGeladao.clientepedido.pedido.domain.Sabor;
import lombok.Getter;

@Getter
public class PedidoClienteListResponse {
	private UUID idPedido;
	private Sabor sabor;
	private int quantidade;
	
	public static List<PedidoClienteListResponse> converte(List<Pedido> pedidosDoCliente) {
		return pedidosDoCliente.stream()
				.map(PedidoClienteListResponse::new)
				.collect(Collectors.toList());	
	}

	public PedidoClienteListResponse(Pedido pedido) {
		super();
		this.idPedido = pedido.getIdPedido();
		this.sabor = pedido.getSabor();
		this.quantidade = pedido.getQuantidade();
	}
	
}
