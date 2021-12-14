package com.letscode.java;

import com.letscode.java.tools.Impressora;
import com.letscode.java.tools.Leitor;

public class Exercicio08 {

    public static void main(String[] args) {
        //Escreva um programa que lê nome, altura e peso de 5 pessoas, calcula o IMC de cada um e
        // ao final informa se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).

        Impressora printer = new Impressora();
        Leitor leitor = new Leitor();

        String[] arrayNomes = new String[5];
        int[] arrayPesos = new int[5];
        float[] arrayAltura = new float[5];
        float[] imcs = new float[5];




        for( int i = 0 ; i < 5 ; i++ ) {
            printer.imprimir(i+1 + " Digite seu nome: ");
            arrayNomes[i] = leitor.leitorPadraoString();
            printer.imprimir(i+1 + " Digite seu peso");
            arrayPesos[i] = leitor.leitorPadraoInt();
            printer.imprimir(i+1 + " Digite sua Altura");
            arrayAltura[i] = leitor.leitorPadraoFloat();
        }
        for (int i = 0; i < 5 ; i++) {
            imcs[i] = arrayPesos[i] / (arrayAltura[i]*arrayAltura[i]);
        }

        for (int i = 0; i < 5; i++) {
            if (imcs[i] > 18.5 && imcs[i] < 25) {
                System.out.println(arrayNomes[i] + " seu IMC é de " + imcs[i] + " parabéns, seu IMC está ideal." );
            }else {
                System.out.println(arrayNomes[i] + " seu IMC é de " + imcs[i] + " está na hora de cuidar da saúde." );
            }

        }

    }

}
