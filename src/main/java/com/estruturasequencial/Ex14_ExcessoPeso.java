package com.estruturasequencial;

import java.util.Scanner;

/*
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
 */
public class Ex14_ExcessoPeso {
    public static void main(String[] args) {
        float peso;
        float excesso;
        float multa = 4.00f;
        float pesloLimite = 50f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o peso: ");
        peso = scanner.nextFloat();
        excesso = peso - pesloLimite;
        multa = excesso * multa;

        System.out.println("Você pescou " + peso + " o excesso foi de " + excesso + " a multa sera de " + multa);
    }
}
