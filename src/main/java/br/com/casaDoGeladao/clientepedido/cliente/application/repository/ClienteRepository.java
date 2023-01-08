package br.com.casaDoGeladao.clientepedido.cliente.application.repository;

import java.util.List;

import br.com.casaDoGeladao.clientepedido.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
}
