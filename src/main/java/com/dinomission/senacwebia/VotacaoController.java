package com.dinomission.senacwebia;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VotacaoController {

    @GetMapping("/votacao")
    public String exibirFormulario() {
        return "votacao-form";
    }

    @PostMapping("/votacao")
    public String validarVotacao(
            @RequestParam String nome,
            @RequestParam Integer idade,
            Model model) {

        String nomeLimpo = nome == null ? "" : nome.trim();
        model.addAttribute("nome", nomeLimpo);
        model.addAttribute("idade", idade);

        if (idade < 0) {
            model.addAttribute("mensagem", "Idade inválida.");
            model.addAttribute("podeVotar", false);
            return "votacao-form";
        }

        boolean podeVotar = idade >= 16;
        String mensagem = podeVotar
                ? nomeLimpo + ", você pode votar."
                : nomeLimpo + ", você ainda não pode votar.";

        model.addAttribute("mensagem", mensagem);
        model.addAttribute("podeVotar", podeVotar);
        return "votacao-form";
    }

    @GetMapping("/teste")
    @ResponseBody
    public String getTeste() {
        return "exemplo de texto retornado como string num endpoint do tipo GET";
    }
}
