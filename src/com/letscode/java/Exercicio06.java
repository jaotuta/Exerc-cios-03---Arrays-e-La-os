package com.letscode.java;

import com.letscode.java.tools.Impressora;
import com.letscode.java.tools.Leitor;

public class Exercicio06 {
    public static void main(String[] args) {
        // Escreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.

        Impressora printer = new Impressora();
        Leitor leitor = new Leitor();

        String nomeFinal = "";

        printer.imprimir("Digite seu nome: ");

        String nome = leitor.leitorPadraoString();

        char[] arrayNome = nome.toCharArray();

        for (int i = 0; i < arrayNome.length; i++) {
            if (i%2 != 0 ) {
                nomeFinal += Character.toUpperCase(nome.charAt(i));
            }else {
                nomeFinal += nome.charAt(i);
            }
        }

        System.out.println("Seu nome para o Orkut é: " + nomeFinal);
    }

}
