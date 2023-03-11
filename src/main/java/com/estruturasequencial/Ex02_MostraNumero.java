package com.estruturasequencial;

import java.util.Scanner;

/*
Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
 */
public class Ex02_MostraNumero {

    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();
        System.out.println("Número digitado é: " + numero);
    }

}
