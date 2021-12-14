package com.letscode.java;
import com.letscode.java.tools.Leitor;

public class Exercício01 {

    public static void main(String[] args) {
	// Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final da entrada dos 5 itens, exiba a lista completa.

        String[] fruitList = new String[5];
        Leitor leitor = new Leitor();

        System.out.println("Liste suas 5 frutas preferidas: ");

        for ( int i = 0; i < 5; i++ ) {
            System.out.println(i+1 + " - ");
            fruitList[i] = leitor.leitorPadraoString();
        }

        for ( int i = 0; i < 5; i++ ) {
            System.out.println(i+1 + " - " + fruitList[i]);
        }
    }
}
