package com.br.cg.portfolio.rest;

import com.br.cg.portfolio.domain.Pessoa;
import com.br.cg.portfolio.domain.Projeto;
import com.br.cg.portfolio.dto.CreateProjetoDto;
import com.br.cg.portfolio.service.ProjetoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ProjetoController {

    private final ProjetoService projetoService;

//    @GetMapping({"/", "/hello"})
//    public String hello(@RequestParam(value = "name", defaultValue = "World") String name,
//                        Model model) {
//        model.addAttribute("name", name);
//        return "hello";
//    }

    @GetMapping("/")
    public String initialPage() {
        return "home";
    }

    @GetMapping("/create")
    public String mostrarFormCadastroProjeto() {
        return "create";
    }

    @PostMapping("/create")
    public String createProjeto(CreateProjetoDto newProjeto, Model model) {
        this.projetoService.salvarProjeto(newProjeto);

        model.addAttribute("projeto", newProjeto);
        return "confirmCreation";
    }

    @GetMapping("/list")
    public String listProjetos(Model model) {
        var list = this.projetoService.listaNomesProjetos();
        model.addAttribute("projetos", list);
        return "list";
    }

    @GetMapping("/detail")
    public String detalhaProjetoPeloId(@RequestParam(value = "id") Long id, Model model) {
        var projeto = this.projetoService.retornaProjetoPeloId(id);
        model.addAttribute("project", projeto);
        return "detail";
    }
}
