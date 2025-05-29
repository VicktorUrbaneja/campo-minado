package com.vicktordev.cm;

import com.vicktordev.cm.model.Tabuleiro;

public class Application {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6,6, 9);

        tabuleiro.alternarMarcacao(4,4);
        tabuleiro.alternarMarcacao(4,5);
        tabuleiro.abrir(3,3);

        System.out.println(tabuleiro);
    }
}
