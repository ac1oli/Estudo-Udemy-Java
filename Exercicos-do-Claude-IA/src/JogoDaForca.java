package src;

import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char[] palavraSecreta = {'j','a', 'v', 'a'};
        char[] progresso = {'_', '_', '_', '_'};
        boolean validador = false;
        char busca = '_';
        

        char letraDigitada;


        do {
            System.out.println("TESTE");
            System.out.print("Digite uma letra: ");
            letraDigitada = sc.next().charAt(0);

            for (int i = 0; i < palavraSecreta.length; i++){

                char texto = ' ';

                if(palavraSecreta[i] == letraDigitada){

                    texto = progresso[i] = letraDigitada;

                }else {
                    System.out.print(progresso[i]);
                }

                System.out.print(texto);
            }

            for (char i : progresso){
                if (i == '_'){
                    validador = true;
                    break;
                } else {
                    validador = false;
                }
            }
        } while (validador);




    }
}
