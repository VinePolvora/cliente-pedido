package br.com.casaDoGeladao.clientepedido.pedido.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.casaDoGeladao.clientepedido.pedido.domain.Pedido;

public interface PedidoSpringDataJPARepository extends JpaRepository<Pedido, UUID> {
	 List<Pedido> findByIdClientePedido(UUID idClientePedido); 
}
