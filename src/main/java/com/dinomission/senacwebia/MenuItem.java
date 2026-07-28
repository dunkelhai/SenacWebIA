package com.dinomission.senacwebia;

public class MenuItem {
    private String titulo;
    private Runnable acao;

    public MenuItem(String titulo, Runnable acao) {
        this.titulo = titulo;
        this.acao = acao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void executar() {
        acao.run();
    }
}
