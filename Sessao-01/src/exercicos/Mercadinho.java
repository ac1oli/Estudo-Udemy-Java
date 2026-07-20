package src.exercicos;

import java.util.Locale;
import java.util.Scanner;

public class Mercadinho {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //codigo das pecas e numero de pecas
        int cp1, cp2, np1, np2;
        //valor unitario de cada peca
        double vup1, vup2, calculo;


        cp1 = sc.nextInt();
        np1 = sc.nextInt();
        vup1 = sc.nextDouble();

        cp2 = sc.nextInt();
        np2 = sc.nextInt();
        vup2 = sc.nextDouble();

        calculo = (np1 * vup1) + (np2 * vup2);

        System.out.printf("VALOR A PAGAR = R$ %.2f %n", calculo);


    }
}
