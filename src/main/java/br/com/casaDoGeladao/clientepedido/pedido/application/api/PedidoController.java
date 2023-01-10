package br.com.casaDoGeladao.clientepedido.pedido.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.casaDoGeladao.clientepedido.pedido.application.service.PedidoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PedidoController implements PedidoAPI {
	private final PedidoService pedidoService;

	@Override
	public PedidoResponse postPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[inicia] PedidoController - postPedido");
		log.info("[idCliente]{}", idCliente);
		PedidoResponse pedido = pedidoService.criaPedido(idCliente, pedidoRequest);
		log.info("[finaliza] PedidoController - postPedido");
		return pedido;
	}

	@Override
	public List<PedidoClienteListResponse> getPedidosDoClienteComId(UUID idCliente) {
		log.info("[inicia] PedidoController - getPedidosDoClienteComId");
		log.info("[idCliente]{}", idCliente);
		List<PedidoClienteListResponse> pedidosDoCliente = pedidoService.buscaPedidosDoClienteComId(idCliente);
		log.info("[finaliza] PedidoController - getPedidosDoClienteComId");
		return pedidosDoCliente;
	}

	@Override
	public PedidoClienteDetalheResponse getPedidoDoClienteAtravesId(UUID idCliente, UUID idPedido) {
		log.info("[inicia] PedidoController - getPedidoDoClienteAtravesId");
		log.info("[idCliente]{} - [idPedido] {}", idCliente, idPedido);
		PedidoClienteDetalheResponse pedido = pedidoService.buscaPedidoDoClienteComId(idCliente, idPedido);
		log.info("[finaliza] PedidoController - getPedidoDoClienteAtravesId");
		return pedido;
	}
}
