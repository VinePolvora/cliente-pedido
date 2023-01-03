package br.com.casaDoGeladao.clientepedido.cliente.application.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {
	
	ClieteResponse postCliente(ClienteRequest clienteRequest);
}
