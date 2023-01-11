package br.com.casaDoGeladao.clientepedido.pedido.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.casaDoGeladao.clientepedido.pedido.application.api.PedidoAlteracaoRequest;
import br.com.casaDoGeladao.clientepedido.pedido.application.api.PedidoRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idPedido", updatable = false, unique = true, nullable = false)
	private UUID idPedido;
	@Column(columnDefinition = "uuid", name = "idClientePedido", nullable = false)
	@NotNull
	private UUID idClientePedido;
	@Enumerated(EnumType.STRING)
	private Sabor sabor;
	private int quantidade;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Pedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		this.idClientePedido = idCliente;
		this.sabor = pedidoRequest.getSabor();
		this.quantidade = pedidoRequest.getQuantidade();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

	public void altera(PedidoAlteracaoRequest pedidoRequest) {
		this.sabor = pedidoRequest.getSabor();
		this.quantidade = pedidoRequest.getQuantidade();
		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
	}
}
