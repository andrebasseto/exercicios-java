package com.estruturasequencial;

import java.util.Scanner;

/*
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */
public class Ex16_LojaDeTinta {
    public static void main(String[] args) {

        float metros;
        float cobertura;
        int latas;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantos metros quadrados sera pintado: ");
        metros = scanner.nextFloat();

        cobertura = 1f / 3f * metros;
        System.out.println(cobertura);

        latas = (int)cobertura / 18;


        if ((cobertura % 18) != 0){
            latas = latas + 1;
        }
        System.out.println(latas + "latas");
        System.out.println("Total de: " +  (latas * 80) + "reais");
    }
}
