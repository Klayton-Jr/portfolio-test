package com.br.cg.portfolio.service.impl;

import com.br.cg.portfolio.dto.CreateProjetoDto;
import com.br.cg.portfolio.dto.ProjetoDto;
import com.br.cg.portfolio.repository.ProjetoRepository;
import com.br.cg.portfolio.service.ProjetoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ProjetoServiceImpl implements ProjetoService {

    private final ProjetoRepository projetoRepository;
    @Override
    public List<ProjetoDto> listaNomesProjetos() {
        return null;
    }

    @Override
    public ProjetoDto retornaProjetoPeloId(Long id) throws NoSuchElementException {
        var projeto = this.projetoRepository.findById(id).orElseThrow(NoSuchElementException::new);
        return new ProjetoDto(projeto.getId(), projeto.getNome(), projeto.getDataInicio(), projeto.getDataPrevisaoFim(),
                projeto.getDataFim(), projeto.getDescricao(), projeto.getStatus(), projeto.getOrcamento(), projeto.getRisco(), null);
    }

    @Override
    public void salvarProjeto(CreateProjetoDto projetoDto) {

    }
}
