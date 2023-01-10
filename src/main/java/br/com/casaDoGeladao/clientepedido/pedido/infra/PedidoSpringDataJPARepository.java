package br.com.casaDoGeladao.clientepedido.pedido.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.casaDoGeladao.clientepedido.pedido.domain.Pedido;

public interface PedidoSpringDataJPARepository extends JpaRepository<Pedido, UUID> {

}
