package com.br.cg.portfolio.repository;

import com.br.cg.portfolio.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}