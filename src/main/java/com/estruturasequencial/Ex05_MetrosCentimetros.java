package com.estruturasequencial;

import java.util.Scanner;

public class Ex05_MetrosCentimetros {
    public static void main(String[] args) {
        float metros;
        float centimetros;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a medida em metros: ");
        metros = scanner.nextFloat();

        centimetros = metros * 100;
        System.out.println("A medida em centimetros é: " + centimetros);
    }
}
