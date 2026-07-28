package com.dinomission.senacwebia;

public class BuscaJogador {
    public static void main(String[] args) {
        String[] volantes = {"Casemiro", "Kante", "Koji Nakata", "Fabinho"};
        boolean encontrou = false;
        int i = 0;

        while (!encontrou && i < volantes.length) {
            System.out.println("Verificando: " + volantes[i]);
            if ("Koji Nakata".equals(volantes[i])) {
                encontrou = true;
                System.out.println("Jogador encontrado para o time titular!");
            }
            i++;
        }
    }
}
