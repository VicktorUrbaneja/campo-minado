package com.vicktordev.cm.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TabuleiroTeste {

    @BeforeEach
    void iniciarTabuleiro(){
        Tabuleiro tabuleiro = new Tabuleiro(3,3,3);
    }

    @Test
    void testeCriarTabuleiro(){
    }
}
