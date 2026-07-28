package com.dinomission.senacwebia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<MenuItem> itens = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void adicionarItem(MenuItem item) {
        itens.add(item);
    }

    public void exibir() {
        while (true) {
            System.out.println("\nMenu:");
            for (int i = 0; i < itens.size(); i++) {
                System.out.println((i + 1) + ". " + itens.get(i).getTitulo());
            }
            System.out.println((itens.size() + 1) + ". Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            if (escolha > 0 && escolha <= itens.size()) {
                itens.get(escolha - 1).executar();
            } else if (escolha == itens.size() + 1) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
