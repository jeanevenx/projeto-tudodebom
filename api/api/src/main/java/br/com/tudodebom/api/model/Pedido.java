package br.com.tudodebom.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.tudodebom.api.services.Cliente;
import lombok.Getter;
import lombok.Setter;


public class Pedido {

@Getter
@Setter
@Entity
@Table(name = "pedido")
	public class Transacao {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(name = "data_transacao")
	    private LocalDateTime data_transacao;
	    
	    @Column(name = "status")
	    private LocalDateTime status;
	    
	    @Column(name = "valor_bruto")
	    private Double valor_Bruto;
	    
	    @Column(name = "desconto")
	    private Double desconto;
	    
	    @Column(name = "valor_final")
	    private Double valor_final;
	    // PARA CADA COMPRA (( UM CLIENTE COMPROU ), LIGAÇÃO COM TABELA CLIENTE)
	    
	    @ManyToOne
	    private Cliente pedido;

	    // LIGAÇÃO COM TABELA MEDICAMENTO ( CADA TRANSACAO RECEBE UM OU MAIS MEDICAMENTOS)
	    @ManyToOne
	    private Produto medicamento;
	}


}

