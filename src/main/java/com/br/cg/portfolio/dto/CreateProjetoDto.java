package com.br.cg.portfolio.dto;

import java.time.LocalDate;

public record CreateProjetoDto(String nome,
                               LocalDate dataInicio,
                               Long gerenteId,
                               LocalDate dataPrevisaoTermino,
                               LocalDate dataRealTermino,
                               Double orcamentoTotal,
                               String descricao,
                               String status) {
}
