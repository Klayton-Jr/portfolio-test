package com.br.cg.portfolio.repository;

import com.br.cg.portfolio.domain.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

    @Override
    Optional<Projeto> findById(Long idPortfolio);

    @Override
    List<Projeto> findAll();
}
