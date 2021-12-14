package com.letscode.java;
import com.letscode.java.tools.Impressora;
import com.letscode.java.tools.Leitor;

public class Exercício02 {

    public static void main(String[] args) {
        // Escreva um programa que lê uma palavra e a escreve de volta ao contrário.

        Impressora printer = new Impressora();
        Leitor leitor = new Leitor();

        printer.imprimir("Digite uma Palavra");
        String palavra = leitor.leitorPadraoString();

        char[] arrayPalavra = palavra.toCharArray();

        String palavraAoContrario = "";

        for (int i = arrayPalavra.length-1; i >= 0 ; i--) {
            palavraAoContrario += arrayPalavra[i];
        }

        printer.imprimir(palavraAoContrario);

    }
}
