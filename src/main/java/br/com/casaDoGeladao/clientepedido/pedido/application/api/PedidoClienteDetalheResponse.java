package br.com.casaDoGeladao.clientepedido.pedido.application.api;

import java.util.UUID;

import br.com.casaDoGeladao.clientepedido.pedido.domain.Pedido;
import br.com.casaDoGeladao.clientepedido.pedido.domain.Sabor;
import lombok.Value;

@Value
public class PedidoClienteDetalheResponse {

	private UUID idPedido;
	private Sabor sabor;
	private int quantidade;
	
	public PedidoClienteDetalheResponse(Pedido pedido) {
		this.idPedido = pedido.getIdPedido();
		this.sabor = pedido.getSabor();
		this.quantidade = pedido.getQuantidade();
	}
}
