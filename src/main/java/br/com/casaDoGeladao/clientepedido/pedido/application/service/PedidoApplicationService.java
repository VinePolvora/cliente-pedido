package br.com.casaDoGeladao.clientepedido.pedido.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.casaDoGeladao.clientepedido.cliente.application.service.ClienteService;
import br.com.casaDoGeladao.clientepedido.pedido.application.api.PedidoClienteListResponse;
import br.com.casaDoGeladao.clientepedido.pedido.application.api.PedidoRequest;
import br.com.casaDoGeladao.clientepedido.pedido.application.api.PedidoResponse;
import br.com.casaDoGeladao.clientepedido.pedido.domain.Pedido;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PedidoApplicationService implements PedidoService {
	private final ClienteService clienteService;
	private final PedidoRepository pedidoRepository;

	@Override
	public PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[inicia] PedidoApplicationService - criaPedido");
		clienteService.buscaClienteAtrasId(idCliente);
		Pedido pedido = pedidoRepository.salvaPedido(new Pedido(idCliente, pedidoRequest));
		log.info("[finaliza] PedidoApplicationService - criaPedido");
		return new PedidoResponse(pedido.getIdPedido());
	}

	@Override
	public List<PedidoClienteListResponse> buscaPedidosDoClienteComId(UUID idCliente) {
		log.info("[inicia] PedidoApplicationService - buscaPedidosDoClienteComId");
		clienteService.buscaClienteAtrasId(idCliente);
		List<Pedido> pedidosDoCliente = pedidoRepository.buscaPedidosDoClienteComId(idCliente);
		log.info("[finaliza] PedidoApplicationService - buscaPedidosDoClienteComId");
		return PedidoClienteListResponse.converte(pedidosDoCliente);
	}
}
