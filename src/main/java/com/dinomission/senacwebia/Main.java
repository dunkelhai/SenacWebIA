package com.dinomission.senacwebia;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Produto produto1 = new Produto("Mouse Gamer", "Razer", 250.00, 10);
        Produto produto2 = new Produto("Teclado Mecânico", "Corsair", 450.00, 5);
        Produto produto3 = new Produto("Monitor Ultrawide", "LG", 1200.00, 3);

        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);
        loja.adicionarProduto(produto3);

        System.out.println("--- Estoque Inicial ---");
        loja.listarProdutos();

        System.out.println("\n--- Registrando Entrada ---");
        loja.registrarEntrada("Mouse Gamer", 5);

        System.out.println("\n--- Registrando Saída ---");
        loja.registrarSaida("Teclado Mecânico", 2);

        System.out.println("\n--- Estoque Final ---");
        loja.listarProdutos();
    }
}
