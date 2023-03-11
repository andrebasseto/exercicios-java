package com.estruturasequencial;

import java.util.Scanner;

/*
Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
 */
public class Ex10_CelsiusFahrenheit {
    public static void main(String[] args) {
        float celsius;
        float fahrenheit;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em Celcius: ");
        celsius = scanner.nextFloat();

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em Fahrenheit é " + fahrenheit);
    }
}
