package com.br.cg.portfolio.dto;

import com.br.cg.portfolio.domain.Projeto;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.br.cg.portfolio.domain.Projeto}
 */
public record ProjetoDto(Long id, String nome, LocalDate dataInicio, LocalDate dataPrevisaoFim, LocalDate dataFim,
                         String descricao, String status, Float orcamento, String risco,
                         PessoaDto gerente) implements Serializable {
}