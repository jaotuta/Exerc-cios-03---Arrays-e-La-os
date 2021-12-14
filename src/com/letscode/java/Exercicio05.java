package com.letscode.java;

import com.letscode.java.tools.Impressora;
import com.letscode.java.tools.Leitor;

public class Exercicio05 {
    public static void main(String[] args) {
        // Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados.
        // Ao final, informe qual o nome mais longo presente na lista.

        Impressora printer = new Impressora();
        Leitor leitor = new Leitor();

        String[] nomes = new String[5];
        String maiorNome = "";

        printer.imprimir("Digite 5 nomes");

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1 + " - ");
            nomes[i] = leitor.leitorPadraoString();
        }

        for (String nome : nomes) {
            if(nome.length() > maiorNome.length()) {
                maiorNome = nome;
            }
        }

        System.out.println("O maior nome é: " + maiorNome + ", contendo " + maiorNome.length() + " letras");
    }

}
