package br.com.casaDoGeladao.clientepedido.cliente.application.repository;

import br.com.casaDoGeladao.clientepedido.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}
