package src.exercicos;

import java.util.Locale;
import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A,B,C,calculoTriangulo, calculoCirculo, calculoTrapezio, calculoQuadrado, calculoRetangulo, PI =3.14159;

        System.out.print("ENTRADA DE DADOS: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        System.out.println();

        calculoTriangulo = (A * C) / 2;
        calculoCirculo = PI * C * C;
        calculoTrapezio = (A + B) * C / 2;
        calculoQuadrado = B * B;
        calculoRetangulo = A * B;

        System.out.println("SAIDA DOS DADOS:");
        System.out.println();

        System.out.printf("TRIANGULO: %.3f %n", calculoTriangulo);
        System.out.printf("CIRCULO: %.3f %n", calculoCirculo);
        System.out.printf("TRAPEZIO: %.3f %n", calculoTrapezio);
        System.out.printf("QUADRADO: %.3f %n", calculoQuadrado);
        System.out.printf("RETANGULO: %.3f %n", calculoRetangulo);





        sc.close();
    }
}
