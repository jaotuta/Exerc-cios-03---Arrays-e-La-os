package com.letscode.java;

import com.letscode.java.tools.Impressora;
import com.letscode.java.tools.Leitor;

public class Exercicio07 {
    public static void main(String[] args) {
        //Escreva um programa que lê nome e idade de 5 pessoas e ao final informa quem é o mais novo, o mais velho e qual a média de idade.

        Impressora printer = new Impressora();
        Leitor leitor = new Leitor();
        String[] arrayNomes = new String[5];
        int[] arrayidades = new int[5];

        int maisNovo = 999999999;
        String nomeMaisNovo = "";
        int maisVelho = 0;
        String nomeMaisVelho = "";

        float somaIdades = 0;



        for( int i = 0 ; i < 5 ; i++ ) {
            printer.imprimir("Digite seu nome: ");
            arrayNomes[i] = leitor.leitorPadraoString();
            printer.imprimir("Digite sua idade");
            arrayidades[i] = leitor.leitorPadraoInt();
        }
        for (int i = 0; i < 5 ; i++) {
            if (arrayidades[i] < maisNovo) {
                maisNovo = arrayidades[i];
                nomeMaisNovo = arrayNomes[i];
            }
            if (arrayidades[i] > maisVelho) {
                maisVelho = arrayidades[i];
                nomeMaisVelho = arrayNomes[i];
            }
            somaIdades += arrayidades[i];
        }

        System.out.println("O Mais Jovem é: " + nomeMaisNovo + " com " + maisNovo + " anos");
        System.out.println("O Mais Velho é: " + nomeMaisVelho + " com " + maisVelho + " anos");
        System.out.println("A média de idade deles são: " + somaIdades/5 + " anos");



    }

}
