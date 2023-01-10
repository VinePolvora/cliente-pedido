package br.com.casaDoGeladao.clientepedido.pedido.application.api;

import java.util.UUID;

import br.com.casaDoGeladao.clientepedido.pedido.domain.Sabor;
import lombok.Value;

@Value
public class PedidoClienteDetalheResponse {
	private UUID idPedido;
	private Sabor sabor;
	private int quantidade;
}
