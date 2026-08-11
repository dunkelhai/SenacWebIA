package com.dinomission.senacwebia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraFreteTest {

    private CalculadoraFrete calculadoraFrete;

    @BeforeEach
    void setUp() {
        calculadoraFrete = new CalculadoraFrete();
    }

    @Test
    void scComValorAcimaDe100FreteGratis() {
        assertEquals(0.0, calculadoraFrete.calcularFrete("SC", 100.01));
        assertEquals(0.0, calculadoraFrete.calcularFrete("SC", 250.0));
    }

    @Test
    void scComValorAte100Cobra15() {
        assertEquals(15.0, calculadoraFrete.calcularFrete("SC", 100.0));
        assertEquals(15.0, calculadoraFrete.calcularFrete("SC", 50.0));
    }

    @Test
    void rsComValorAcimaDe100FreteGratis() {
        assertEquals(0.0, calculadoraFrete.calcularFrete("RS", 150.0));
    }

    @Test
    void rsComValorAte100Cobra20() {
        assertEquals(20.0, calculadoraFrete.calcularFrete("RS", 100.0));
        assertEquals(20.0, calculadoraFrete.calcularFrete("RS", 30.0));
    }

    @Test
    void outroEstadoCobra30() {
        assertEquals(30.0, calculadoraFrete.calcularFrete("SP", 500.0));
        assertEquals(30.0, calculadoraFrete.calcularFrete("PR", 10.0));
    }
}
