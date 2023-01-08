package br.com.casaDoGeladao.clientepedido.cliente.application.service;

import java.util.List;

import br.com.casaDoGeladao.clientepedido.cliente.application.api.ClienteListResponse;
import br.com.casaDoGeladao.clientepedido.cliente.application.api.ClienteRequest;
import br.com.casaDoGeladao.clientepedido.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
}
