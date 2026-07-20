package com.dinomission.senacwebia;

public class GerenciadorTime {
    public static void main(String[] args) {
        String[] jogadores = {"Marco van Basten", "Koji Nakata", "Romário"};
        String[] posicoes = {"CA", "Volante", "CA"};

        System.out.println("Escalação confirmada:");

        for (int i = 0; i < jogadores.length - 1; i++) {
            if (posicoes[i] == "CA") {
                System.out.println("Ataque: " + jogadores[i]);
            } else if (posicoes[i] == "Volante") {
                System.out.println("Meio-campo: " + jogadores[i]);
            }
        }
    }
}
