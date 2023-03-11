package com.estruturasequencial;

import java.util.Scanner;

/*
    Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

    salário bruto.
    quanto pagou ao INSS.
    quanto pagou ao sindicato.
    o salário líquido.
    calcule os descontos e o salário líquido, conforme a tabela abaixo:

    + Salário Bruto : R$
    - IR (11%) : R$
    - INSS (8%) : R$
    - Sindicato ( 5%) : R$
    = Salário Liquido : R$
 */
public class Ex15_Salario {
    public static void main(String[] args) {
        float salarioHora;
        float horasTrabalhadas;
        float salarioBruto;
        float ir = 11;
        float irDesconto;
        float inss = 8;
        float inssDesconto;
        float sindicato = 5;
        float sindicatoDesconto;
        float salarioLiquido;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quanto ganha por hora");
        salarioHora = scanner.nextFloat();;
        System.out.println("Informe a quantidade de horas trabalhadas no mes: ");
        horasTrabalhadas = scanner.nextFloat();

        salarioBruto = salarioHora * horasTrabalhadas;

        System.out.println("+ Salario bruto: R$ " + (salarioBruto));

        irDesconto = salarioBruto * ir / 100;
        inssDesconto = salarioBruto * inss / 100;
        sindicatoDesconto = salarioBruto * sindicato / 100;

        System.out.println("- IR(" + ir + "%) : R$ " + irDesconto);
        System.out.println("- INSS(" + inss + "%) : R$ " + inssDesconto);
        System.out.println("- Sindicato(" + sindicato + "%) : R$ " + sindicatoDesconto);

        salarioLiquido = salarioBruto - irDesconto - inssDesconto - sindicatoDesconto;

        System.out.println("Salario Liquido R$: " + salarioLiquido);

    }
}
