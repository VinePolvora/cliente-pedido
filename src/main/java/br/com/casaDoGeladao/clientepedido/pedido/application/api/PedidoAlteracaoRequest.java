package br.com.casaDoGeladao.clientepedido.pedido.application.api;

import br.com.casaDoGeladao.clientepedido.pedido.domain.Sabor;
import lombok.Value;

@Value
public class PedidoAlteracaoRequest {
	private Sabor sabor;
	private int quantidade;
}
