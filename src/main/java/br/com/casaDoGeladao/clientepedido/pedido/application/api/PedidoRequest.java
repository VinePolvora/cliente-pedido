package br.com.casaDoGeladao.clientepedido.pedido.application.api;

import br.com.casaDoGeladao.clientepedido.pedido.domain.Sabor;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PedidoRequest {
	@NotNull
	private Sabor sabor;
	@NotNull
	private int quantidade;
}
