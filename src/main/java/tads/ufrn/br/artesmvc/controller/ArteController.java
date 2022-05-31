package tads.ufrn.br.artesmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import tads.ufrn.br.artesmvc.domain.Arte;
import tads.ufrn.br.artesmvc.service.ArteService;

import java.util.List;

@Controller
public class ArteController {
    private ArteService service;

    public ArteController(ArteService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getHome(){
        return "index";
    }

    @GetMapping("/cadastra")
    public String doCadastra(Model model){
        Arte a = new Arte();
        model.addAttribute("arteninja", a);
        return "cadastra";
    }

    @PostMapping("/salvar")
    public String doSalvar(@ModelAttribute Arte arte){
        service.insert(arte);
        return "redirect:/";
    }
}










