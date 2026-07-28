package com.dinomission.senacwebia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AlunoController {

    @GetMapping("/api/alunos")
    public List<String> listarAlunos() {
        return List.of("Ana", "Carlos", "Beatriz");
    }
}
