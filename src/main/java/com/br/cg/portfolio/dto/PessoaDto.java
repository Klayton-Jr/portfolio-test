package com.br.cg.portfolio.dto;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.br.cg.portfolio.domain.Pessoa}
 */
public record PessoaDto(Long id, String nome, LocalDate dataNascimento, String cpf, Boolean funcionario,
                        Boolean gerente) implements Serializable {
}