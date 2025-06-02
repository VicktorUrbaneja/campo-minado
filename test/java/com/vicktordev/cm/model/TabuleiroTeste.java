package com.vicktordev.cm.model;

import com.vicktordev.cm.exceptions.ExplosaoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TabuleiroTeste {

    private Tabuleiro tabuleiro;
    private Campo campo;


    @BeforeEach
    void iniciarTabuleiro() {
        tabuleiro = new Tabuleiro(3, 3, 1);
        campo = new Campo(3, 2);
        tabuleiro.campos.add(campo);
    }

    @Test
    void testeAbrirNaoMinado() {
        tabuleiro.abrir(3, 2);
        assertTrue(campo.isAberto());
    }

    @Test
    void testeAbrirMinado() {
        campo.minar();
        assertThrows(ExplosaoException.class, () -> {
            tabuleiro.abrir(3, 2);
        });
    }

    @Test
    void testeAlternarMarcacao() {
        tabuleiro.alternarMarcacao(3, 2);
        assertTrue(campo.isMarcado());
    }

    @Test
    void testeObjetivoAlcancado() {
        tabuleiro.campos.forEach(c -> {
            if (c.isMinado()) {
                c.alternarMarcacao();
            } else {
                c.abrir();
            }
        });
        assertTrue(tabuleiro.objetivoAlcancado());
    }

    @Test
    void testeReiniciar() {
        tabuleiro.reiniciar();
        assertTrue(tabuleiro.campos.stream().allMatch(c -> !c.isAberto() && !c.isMarcado()));
    }

    @Test
    void testeToString() {
        String esperado =
                "   0  1  2 \n" +
                        "0  ?  ?  ? \n" +
                        "1  ?  ?  ? \n" +
                        "2  ?  ?  ? \n";

        assertEquals(esperado, tabuleiro.toString());
    }
}
