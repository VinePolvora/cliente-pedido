package br.com.casaDoGeladao.clientepedido.pedido.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idPedido", updatable = false, unique = true, nullable = false)
	private UUID idPedido;
	@Column(columnDefinition = "uuid", name = "idClientePedido", nullable = false)
	private UUID idClientePedido;
	@Enumerated(EnumType.STRING)
	private Sabor sabor;
	@NotNull
	private int quantidade;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

//	public pedido(ClienteRequest clienteRequest) {
//		this.nomeCompleto = clienteRequest.getNomeCompleto();
//		this.email = clienteRequest.getEmail();
//		this.celular = clienteRequest.getCelular();
//		this.telefone = clienteRequest.getTelefone();
//		this.sexo = clienteRequest.getSexo();
//		this.dataNascimento = clienteRequest.getDataNascimento();
//		this.cpf = clienteRequest.getCpf();
//		this.aceitaTermos = clienteRequest.getAceitaTermos();
//		this.dataHoraDoCadastro = LocalDateTime.now();
//	}
//
//	public void altera(ClienteAlteracaoRequest clienteAlteracaoRequest) {
//		this.nomeCompleto = clienteAlteracaoRequest.getNomeCompleto();
//		this.celular = clienteAlteracaoRequest.getCelular();
//		this.telefone = clienteAlteracaoRequest.getTelefone();
//		this.sexo = clienteAlteracaoRequest.getSexo();
//		this.dataNascimento = clienteAlteracaoRequest.getDataNascimento();
//		this.aceitaTermos = clienteAlteracaoRequest.getAceitaTermos();
//		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
//	}
}
