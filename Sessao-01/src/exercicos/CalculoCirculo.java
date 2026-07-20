package src.exercicos;

import java.util.Locale;
import java.util.Scanner;

public class CalculoCirculo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio;
        double PI = 3.14159;

        System.out.print("Digite o valor do Raio: ");
        raio = sc.nextDouble();

        double calculo = PI * raio * raio;

        System.out.printf("A = %.4f", calculo);

        sc.close();
    }
}
