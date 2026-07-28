package com.dinomission.senacwebia;

public class HistoriaJapao {
    public static void main(String[] args) {
        String[] xoguns = {"Oda Nobunaga", "Toyotomi Hideyoshi", null, "Tokugawa Ieyasu"};

        for (String xogun : xoguns) {
            if (xogun != null) {
                System.out.println("Grande Líder: " + xogun.toUpperCase());
            }
        }
    }
}
