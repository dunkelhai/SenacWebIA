package com.dinomission.senacwebia;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VotacaoControllerTest {

    private final VotacaoController controller = new VotacaoController();

    @Test
    void deveExibirFormulario() {
        assertEquals("votacao-form", controller.exibirFormulario());
    }

    @Test
    void devePermitirVotoQuandoIdadeMaiorOuIgualA16() {
        Model model = new ExtendedModelMap();

        String view = controller.validarVotacao("Ana", 18, model);

        assertEquals("votacao-form", view);
        assertEquals("Ana, você pode votar.", model.getAttribute("mensagem"));
        assertTrue((Boolean) model.getAttribute("podeVotar"));
    }

    @Test
    void deveNegarVotoQuandoIdadeMenorQue16() {
        Model model = new ExtendedModelMap();

        String view = controller.validarVotacao("Leo", 15, model);

        assertEquals("votacao-form", view);
        assertEquals("Leo, você ainda não pode votar.", model.getAttribute("mensagem"));
        assertFalse((Boolean) model.getAttribute("podeVotar"));
    }

    @Test
    void deveRetornarErroQuandoIdadeForNegativa() {
        Model model = new ExtendedModelMap();

        String view = controller.validarVotacao("Leo", -1, model);

        assertEquals("votacao-form", view);
        assertEquals("Idade inválida.", model.getAttribute("mensagem"));
        assertFalse((Boolean) model.getAttribute("podeVotar"));
    }
}
