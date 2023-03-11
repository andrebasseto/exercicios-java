package com.estruturasequencial;

import java.util.Scanner;

/*
Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 */
public class Ex08_SalarioMes {
    public static void main(String[] args) {
        float salarioHora;
        float horasTrabalhadas;
        float salarioMes;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu salario por hora: ");
        salarioHora = scanner.nextFloat();
        System.out.println("Informa quantas horas trabalha por mes: ");
        horasTrabalhadas = scanner.nextFloat();

        salarioMes = salarioHora * horasTrabalhadas;
        System.out.println("O salario mensal é de: " + salarioMes);
    }
}
