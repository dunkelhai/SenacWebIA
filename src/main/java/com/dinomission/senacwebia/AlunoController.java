package com.dinomission.senacwebia;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

public class AlunoController {

    @GetMapping("/api/alunos")
    public List<String> listarAlunos() {
        return List.of("Ana", "Carlos", "Beatriz");
    }
}
