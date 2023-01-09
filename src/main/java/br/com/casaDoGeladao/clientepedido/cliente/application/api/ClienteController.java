package br.com.casaDoGeladao.clientepedido.cliente.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.casaDoGeladao.clientepedido.cliente.application.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[finaliza] ClienteController - postCliente");
		return clienteCriado;
	}

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[inicia] ClienteController - getTodosClientes");
		List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
		log.info("[finaliza] ClienteController - getTodosClientes");
		return clientes;
	}

	@Override
	public ClienteDetalhadoResponse getClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteController - getClienteAtravesId");
		log.info("[idCliente]{}", idCliente);
		ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClienteAtrasId(idCliente);
		log.info("[finaliza] ClienteController - getClienteAtravesId");
		return clienteDetalhado;
	}

	@Override
	public void deletaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteController - deletaClienteAtravesId");
		log.info("[idCliente]{}", idCliente);
		clienteService.deletaClienteAtrasId(idCliente);
		log.info("[finaliza] ClienteController - deletaClienteAtravesId");
	}

	@Override
	public void patchAlteraCliente(UUID idCliente, @Valid ClienteAlteracaoRequest clienteAlteracaoRequest) {
		log.info("[inicia] ClienteController - patchAlteraCliente");
		log.info("[idCliente]{}", idCliente);
		clienteService.patchAlteraCliente(idCliente, clienteAlteracaoRequest);
		log.info("[finaliza] ClienteController - patchAlteraCliente");
	}
}
