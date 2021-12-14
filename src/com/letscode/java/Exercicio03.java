package com.letscode.java;

import com.letscode.java.tools.Impressora;
import com.letscode.java.tools.Leitor;

public class Exercicio03 {
    public static void main(String[] args) {
        // Escreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os pares.

        Impressora printer = new Impressora();
        Leitor leitor = new Leitor();

        int[] numeros = new int[5];

        printer.imprimir("Digite 5 numeros");

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1 + " - ");
            numeros[i] = leitor.leitorPadraoInt();
        }

        for (int i = 0; i<numeros.length; i++) {
            if(numeros[i]%2 != 0){
                System.out.println(i+1 + " - " + numeros[i]);
            }
        }
        for (int i = 0; i<numeros.length; i++) {
            if(numeros[i]%2 == 0){
                System.out.println(i+1 + " - " + numeros[i]);
            }
        }


    }
}
