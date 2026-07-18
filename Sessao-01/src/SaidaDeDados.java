package src;

import java.util.Locale; // Importacao de uma biblioteca para algumas funcoes do meu codigo funcionarem normalmente

public class SaidaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Hello World"); // Esse println no final, que dizer que apos exibir o dado na tela, vai qebrar uma linha e vai seguir o resto do codigo
        System.out.print("Hello World"); // Ja aqui, pelo fato de nao ter o ln no final, ele so vai exibir os valores na tela e a sequencia do codigo estara na mesma

        System.out.println(" - vai sair na mesma linha do print sem o ln");
        System.out.println("Agora por ter o ln no final do umtimo print, vai sair em baixo");

        int idade = 32;
        System.out.println(idade);
        double salario = 100.1522;
        System.out.println(salario);
        System.out.printf("%.2f %n", salario); // Utilizando o printf para exibir algumas casas deciamais em expecifico, sem deixar exibir tudo da variavel, e o %n e para quebrar linha
        String texto = "Alexsandro Acioli";
        System.out.println(texto + ", seja muito bem vindo de volta");
        char sexo = ('M');
        System.out.println("O usuario " + texto + " e do sexo " + sexo); // Esse sinal do + serve para fazer a concatenacao de variaveis ou com textos


        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Exercicio de fixacao Udemy");
        System.out.println();

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Product:");
        System.out.printf("%s, which price is $ %.2f %n", product1, price1);
        System.out.printf("%s, which price is $ %.2f %n", product2, price2);
        System.out.println();

        System.out.printf("Record: %d years old, code %d and gender: %c %n", age, code, gender);
        System.out.println();

        System.out.printf("Measue with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n", measure);
        System.out.printf("US decimal point: %.3f", measure);



    }

}