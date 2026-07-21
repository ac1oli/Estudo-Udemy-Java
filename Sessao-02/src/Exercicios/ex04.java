package src.Exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

public class ex04 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1, num2, calculo;
        System.out.print("Digite um valor: ");
        num1 = sc.nextInt();
        System.out.print("Digite outro valor: ");
        num2 = sc.nextInt();



        if (num1 < num2){
            calculo = num2 - num1;
            System.out.println("O JOGO DUROU " + calculo + " HORA(S)");
        } else {
            calculo = (24 - num1) + num2;
            System.out.println("O JOGO DUROU " + calculo + " 0HORA(S)");
        }

    }
}
