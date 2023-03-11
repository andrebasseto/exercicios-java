package com.estruturasequencial;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .
a soma do triplo do primeiro com o terceiro.
o terceiro elevado ao cubo.
 */
public class Ex11_DoisNumeros {
    public static void main(String[] args) {
        int numeroUm;
        int numeroDois;
        float numeroTres;
        float dobro;
        float triplo;
        float cubo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor para o primeiro numero: ");
        numeroUm = scanner.nextInt();
        System.out.print("Informe o valor para o segundo numero: ");
        numeroDois = scanner.nextInt();
        System.out.print("Informe o valor para o segundo terceiro: ");
        numeroTres = scanner.nextFloat();

        dobro = (numeroUm * 2) + (numeroDois / 2);
        triplo = (numeroUm * 3) + numeroTres;
        cubo = ((numeroTres * numeroTres)*numeroTres);

        System.out.println("dobro do primeiro com metade do segundo " + dobro);
        System.out.println("soma do triplo do primeiro com o terceiro " + triplo);
        System.out.println("terceiro elevado ao cubo " + cubo);
    }
}
