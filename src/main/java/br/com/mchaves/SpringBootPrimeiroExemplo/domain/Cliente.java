package br.com.mchaves.SpringBootPrimeiroExemplo.domain;


import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_CLIENTE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_seq")
    @SequenceGenerator(name="cliente_seq", sequenceName="sq_cliente", initialValue = 1, allocationSize = 1)
    private Long id;

    @jakarta.persistence.Column(name = "NOME", nullable = false, length = 50)
    private String nome;

    @jakarta.persistence.Column(name = "CPF", nullable = false, unique = true)
    private Long cpf;

    @jakarta.persistence.Column(name = "TEL", nullable = false)
    private Long tel;

    @jakarta.persistence.Column(name = "EMAIL", nullable = false, length = 50)
    private String email;

    @jakarta.persistence.Column(name = "ENDERECO", nullable = false, length = 100)
    private String end;

    @jakarta.persistence.Column(name = "NUMERO", nullable = false)
    private Integer numero;

    @jakarta.persistence.Column(name = "CIDADE", nullable = false, length = 100)
    private String cidade;

    @jakarta.persistence.Column(name = "ESTADO", nullable = false, length = 50)
    private String estado;


}
