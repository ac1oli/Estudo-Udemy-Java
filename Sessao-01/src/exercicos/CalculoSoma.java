package src.exercicos;

import java.util.Scanner;

public class CalculoSoma {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x,y;

        System.out.print("Digite um valor: ");
        x = sc.nextInt();
        System.out.print("Digite outro valor: ");
        y = sc.nextInt();
        System.out.println();

        int calculo = x + y;

        System.out.print("SOMA = " + calculo);

        sc.close();
    }
}
