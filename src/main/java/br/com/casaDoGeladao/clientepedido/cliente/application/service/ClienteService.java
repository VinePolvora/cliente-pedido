package br.com.casaDoGeladao.clientepedido.cliente.application.service;

import br.com.casaDoGeladao.clientepedido.cliente.application.api.ClienteRequest;
import br.com.casaDoGeladao.clientepedido.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
