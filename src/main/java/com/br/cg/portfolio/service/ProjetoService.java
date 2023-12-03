package com.br.cg.portfolio.service;

import com.br.cg.portfolio.dto.CreateProjetoDto;
import com.br.cg.portfolio.dto.ProjetoDto;

import java.util.List;

public interface ProjetoService {
    List<ProjetoDto> listaNomesProjetos();
    ProjetoDto retornaProjetoPeloId(Long id);
    void salvarProjeto(CreateProjetoDto projetoDto);
}
