package com.br.cg.portfolio.rest;

import com.br.cg.portfolio.service.ProjetoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class HelloController {

    private final ProjetoService projetoService;

    @GetMapping({"/", "/hello"})
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name,
                        Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/")
    public String initialPage() {
        return "home";
    }

    @GetMapping("/list")
    public String listProjetos(Model model) {
        var list = this.projetoService.listaNomesProjetos();
        model.addAttribute("listProjects", list);
        return "list";
    }

    @GetMapping("/detail")
    public String detalhaProjetoPeloId(@RequestParam(value = "id") Long id, Model model) {
        var projeto = this.projetoService.retornaProjetoPeloId(id);
        model.addAttribute("project", projeto);
        return "detail";
    }
}
