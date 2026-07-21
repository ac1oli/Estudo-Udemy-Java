package src.Exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
*/

public class ex05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("CODIGO\tESPECIFICAÇÃO\tPREÇO\n");
        System.out.print("-----------------------------------\n");
        System.out.print("1 \t Cachorro Quente \t R$ 4.00 \n");
        System.out.print("2 \t X-Salada \t\t\t R$ 4.50 \n");
        System.out.print("3 \t X-Bacon \t\t\t R$ 5.00 \n");
        System.out.print("4 \t Torrada simples \t R$ 2.00 \n");
        System.out.print("5 \t Refrigerante \t\t R$ 1.50 \n");
        System.out.println();

        int num1, num2;
        double calculo, value;
        System.out.print("Digite o codigo: ");
        num1 = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        num2 = sc.nextInt();
        System.out.println();

        switch (num1){

            case 1:
                value = 4.00;
                calculo = value * num2;
                System.out.printf("TOTAL: R$ %.2f", calculo);
                break;

            case 2:
                value = 4.50;
                calculo = value * num2;
                System.out.printf("TOTAL: R$ %.2f", calculo);
                break;

            case 3:
                value = 5.00;
                calculo = value * num2;
                System.out.printf("TOTAL: R$ %.2f", calculo);
                break;

            case 4:
                value = 2.00;
                calculo = value * num2;
                System.out.printf("TOTAL: R$ %.2f", calculo);
                break;

            case 5:
                value = 1.00;
                calculo = value * num2;
                System.out.printf("TOTAL: R$ %.2f", calculo);
                break;
        }



    }
}
