package com.letscode.java.tools;

import java.util.Scanner;

public class Leitor {


    Scanner leitor = new Scanner(System.in);

    public String leitorPadraoString() {
        String fruta = leitor.next();
        return fruta;
    }
    public int leitorPadraoInt() {
        int numero = leitor.nextInt();
        return numero;
    }

    public float leitorPadraoFloat() {
        float numero = leitor.nextFloat();
        return numero;
    }
}
