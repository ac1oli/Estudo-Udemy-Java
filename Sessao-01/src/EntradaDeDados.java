package src;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); // Aqui estamos criando um objeto para podermos conseguir fazer as nossas entradas de dados atravez do teclado

        String x;
        int y;
        double z;

        System.out.println("Digite o seu nome: ");
        x = sc.next(); // Aqui estamos dizendo que e para ser atribuido o texto que for passado para a variavel atravez do teclado. Mas lembrando que ele nao aceita nomes compostos.
        System.out.println(x);

        System.out.println("Digite a sua idade: ");
        y = sc.nextInt(); // Aqui estamos dizendo para ser atribuido um valor inteiro passado para o teclado. Lembrando que se passar texto ou numero com ponto flutuante, vai dar erro
        System.out.println(y);

        System.out.println("Digite a sua altura: ");
        z = sc.nextDouble(); // Aqui estamos dizendo para atribuir um valor com ponto flutuante passado pelo teclado. lembrando que se passar um numero inteiro, vai tbm, porem ele vai ficar com casa decimal
        System.out.println(z);


        sc.close(); // Para avisar ao JAVA que a gente nao ira mais usar entradas de dados
    }
}
