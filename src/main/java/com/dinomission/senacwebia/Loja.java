package com.dinomission.senacwebia;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;

    public Loja() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void registrarEntrada(String nomeProduto, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                produto.adicionarEstoque(quantidade);
                System.out.println("Entrada de " + quantidade + " unidades do produto " + nomeProduto + " registrada.");
                return;
            }
        }
        System.out.println("Produto " + nomeProduto + " não encontrado.");
    }

    public void registrarSaida(String nomeProduto, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                produto.removerEstoque(quantidade);
                System.out.println("Saída de " + quantidade + " unidades do produto " + nomeProduto + " registrada.");
                return;
            }
        }
        System.out.println("Produto " + nomeProduto + " não encontrado.");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto no estoque.");
        } else {
            System.out.println("--- Lista de Produtos ---");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
            System.out.println("-------------------------");
        }
    }
}
