package com.estruturasequencial;

import java.util.Scanner;

/*
Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 */
public class Ex07_AreaQuadrado {
    public static void main(String[] args) {
        float base;
        float altura;
        float area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a base: ");
        base = scanner.nextFloat();
        System.out.println("Informe a altura: ");
        altura = scanner.nextFloat();

        area = base * altura;
        System.out.println("A area do quadrado é: " + area);
        System.out.println("O dobro da area é " + (area * 2));
    }
}
