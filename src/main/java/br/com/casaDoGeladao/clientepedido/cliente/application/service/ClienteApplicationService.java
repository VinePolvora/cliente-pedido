package br.com.casaDoGeladao.clientepedido.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.casaDoGeladao.clientepedido.cliente.application.api.ClienteAlteracaoRequest;
import br.com.casaDoGeladao.clientepedido.cliente.application.api.ClienteDetalhadoResponse;
import br.com.casaDoGeladao.clientepedido.cliente.application.api.ClienteListResponse;
import br.com.casaDoGeladao.clientepedido.cliente.application.api.ClienteRequest;
import br.com.casaDoGeladao.clientepedido.cliente.application.api.ClienteResponse;
import br.com.casaDoGeladao.clientepedido.cliente.application.repository.ClienteRepository;
import br.com.casaDoGeladao.clientepedido.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[inicia] ClienteApplicationService - buscaTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - buscaTodosClientes");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClienteDetalhadoResponse buscaClienteAtrasId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - buscaClienteAtrasId");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		log.info("[finaliza] ClienteApplicationService - buscaClienteAtrasId");
		return new ClienteDetalhadoResponse(cliente);
	}

	@Override
	public void deletaClienteAtrasId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - deletaClienteAtrasId");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		clienteRepository.deletaCliente(cliente);
		log.info("[finaliza] ClienteApplicationService - deletaClienteAtrasId");
	}

	@Override
	public void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest) {
		log.info("[inicia] ClienteApplicationService - patchAlteraCliente");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		cliente.altera(clienteAlteracaoRequest);
		clienteRepository.salva(cliente);
		log.info("[finaliza] ClienteApplicationService - patchAlteraCliente");		
	}


}
