package com.estruturasequencial;

import java.util.Scanner;

/*
Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9).
 */
public class Ex09_FahrenheitCelsius {
    public static void main(String[] args) {
        float fahrenheit;
        float celcius;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        fahrenheit = scanner.nextFloat();;

        celcius = 5 * ((fahrenheit-32) / 9);
        System.out.println("A temperatura em Celcius é: " + celcius);
    }
}
