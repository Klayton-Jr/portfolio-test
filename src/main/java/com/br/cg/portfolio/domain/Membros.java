package com.br.cg.portfolio.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "membros")
public class Membros {

    @ManyToOne
    @JoinColumn(name = "idprojeto", nullable = false)
    @Id
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "idpessoa", nullable = false)
    private Pessoa pessoa;

    // getters e setters
}

