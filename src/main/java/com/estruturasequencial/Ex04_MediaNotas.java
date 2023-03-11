package com.estruturasequencial;

import java.util.Scanner;

/*
Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */
public class Ex04_MediaNotas {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as notas: ");
        nota1 = scanner.nextFloat();
        nota2 = scanner.nextFloat();
        nota3 = scanner.nextFloat();
        nota4 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é: " + media);
    }
}
