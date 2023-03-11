package com.estruturasequencial;

import java.util.Scanner;

/*
Faça um Programa que peça dois números e imprima a soma.
 */
public class Ex02_Soma {
    public static void main(String[] args) {
        int numeroUm;
        int numeroDois;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        numeroUm = scanner.nextInt();
        System.out.print("Digite outro numero: ");
        numeroDois = scanner.nextInt();

        System.out.println("A soma dos números é: " + (numeroUm + numeroDois));
    }
}
