package com.letscode.java;

import com.letscode.java.tools.Impressora;
import com.letscode.java.tools.Leitor;

public class Exercicio04 {
    public static void main(String[] args) {
        // Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.

        Impressora printer = new Impressora();
        Leitor leitor = new Leitor();

        int[] numeros = new int[5];
        int maiorNumero = 0;
        int menorNumero = 999999999;
        float somaNumeros = 0;

        printer.imprimir("Digite 5 numeros");

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1 + " - ");
            numeros[i] = leitor.leitorPadraoInt();
        }

        for (int i = 0; i < 5; i++ ) {
            if(numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
            if(numeros[i] < menorNumero) {
                menorNumero = numeros[i];
            }
            somaNumeros += numeros[i];
        }

        System.out.println("O maior numero é: " + maiorNumero + ", o menor é: " + menorNumero + ", e a média dos numeros são: " + somaNumeros/numeros.length);


    }

}
