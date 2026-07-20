package com.dinomission.senacwebia;

public class CalculadoraFrete {
    public double calcularFrete(String estado, double valorCompra) {
        double frete = 0.0;

        if(estado.equals("SC")) {
            if(valorCompra > 100) {
                frete = 0.0;
            } else {
                frete = 15.0;
            }
        } else if(estado.equals("RS")) {
            if(valorCompra > 100) {
                frete = 0.0;
            } else {
                frete = 20.0;
            }
        } else {
            frete = 30.0;
        }

        return frete;
    }
}
