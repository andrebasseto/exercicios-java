package com.estruturasequencial;

import java.util.Scanner;

/*
Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58
 */
public class Ex12_PesoIdeal {
    public static void main(String[] args) {
        float altura;
        float pesoIdeal;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a sua altura: ");
        altura = scanner.nextFloat();

        pesoIdeal = (72.7f * altura) - 58;
        System.out.println("O peso ideal é " + pesoIdeal);
    }
}
