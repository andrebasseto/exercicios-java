package com.estruturasequencial;

import java.util.Objects;
import java.util.Scanner;

/*
Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:

    Para homens: (72.7*h) - 58
    Para mulheres: (62.1*h) - 44.7
 */
public class Ex13_PesoIdeal {
    public static void main(String[] args) {
        float altura;
        float pesoIdeal = 0;
        String genero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        altura = scanner.nextFloat();

        System.out.println("Informe seu genero m - mulher, h - homem: ");
        genero = scanner.next();

        if ((Objects.equals(genero, "m")) || (Objects.equals(genero, "M"))){
            pesoIdeal = (62.1f * altura) - 44.7f;
        } else if ((Objects.equals(genero, "h")) || (Objects.equals(genero, "H"))){
            pesoIdeal = (72.7f * altura) - 58;
        } else{
            System.out.println("Genero invalido");
        }

        System.out.println("Peso ideal: " + pesoIdeal);
    }
}
