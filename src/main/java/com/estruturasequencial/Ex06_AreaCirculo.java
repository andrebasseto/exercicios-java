package com.estruturasequencial;

import java.util.Scanner;

/*
Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */
public class Ex06_AreaCirculo {
    public static void main(String[] args) {
        float raio;
        float area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        raio = scanner.nextFloat();

        area = 3.14f * raio * raio;
        System.out.println("Area do circulo é: " + area);
    }
}
