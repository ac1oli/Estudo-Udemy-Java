package src.Exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
*/

public class ex01 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Digite um valor: ");
        num = sc.nextInt();

        if (num < 0){
            System.out.println("NEGATIVO");
        } else{
            System.out.println("NAO NEGATIVO");
        }
    }
}
