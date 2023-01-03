package br.com.casaDoGeladao.clientepedido.cliente.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ClieteResponse postCliente(@RequestBody ClienteRequest clienteRequest);
}
