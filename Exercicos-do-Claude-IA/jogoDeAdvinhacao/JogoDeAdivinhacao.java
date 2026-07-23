package jogoDeAdvinhacao;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class JogoDeAdivinhacao {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Random rdm = new Random();
        int numAleatorio = rdm.nextInt(50);
        int tentativas = 5;
        int numDigitado = -0;

        System.out.println("Tente adivinhar o numero gerado ateatorio entre 0 - 50");
        System.out.println();

        //Enquanto tiver tentativas ou quando acertar o numero;
        while (tentativas > 0 && numDigitado != numAleatorio) {


            System.out.print("Digite um valor: ");
            numDigitado = sc.nextInt();


            if (numDigitado == numAleatorio){
                System.out.println("Parabens, voce acertou! O numero correto e: " + numAleatorio);
                break;
            } else if (numDigitado > numAleatorio){
                System.out.println("# O valor e mais baixo #");
            } else if (numDigitado < numAleatorio){
                System.out.println("# O valor e mais alto #");
                System.out.println();
            }

            tentativas -= 1;
            System.out.println("# Tetativas restantes: " + tentativas + " #");
            System.out.println();

        }

        if (numDigitado != numAleatorio){
            System.out.println("O numero correto era: " + numAleatorio);
        }

        System.out.println("----------FIM----------");

    }
}
