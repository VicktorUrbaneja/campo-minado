package com.vicktordev.cm;

import com.vicktordev.cm.model.Tabuleiro;
import com.vicktordev.cm.view.TabuleiroConsole;

public class Application {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 9);
        new TabuleiroConsole(tabuleiro);

    }
}
