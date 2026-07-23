package src;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Random rdm = new Random();

        int placarPC = 0, placarJogador = 0; // Placar

        System.out.println("Jogo de pedra, papel e tesoura");
        System.out.println();

        do {
            String[] jogadas = {"pedra", "papel", "tesoura"};
            int indice = rdm.nextInt(3);
            String jogadaPC = jogadas[indice]; // Resposta do PC

            String jogadorJogador; // Respsota do jogador

            System.out.print("Digite a sua opcao entre as 3 possiveis: ");
            jogadorJogador = sc.next();
            System.out.println();

            int processo = disputa(jogadaPC, jogadorJogador);

            if (processo == 0){
                System.out.println("Empate");
            } else if (processo == 1) {
                System.out.println("PC GAHOU!");
                placarPC += 1;
            } else if (processo == 2) {
                System.out.println("JOGADOR GANHOU!");
                placarJogador += 1;
            }

            System.out.println();
            System.out.println("Placar PC: " + placarPC);
            System.out.println("Placar JOGADOR: " + placarJogador);
            System.out.println();
            System.out.println("-----------------------------------------------");
            System.out.println();


        } while (placarPC <= 2 && placarJogador <= 2);



        //TESTE

        System.out.println(disputa("pedra", "tesoura"));



    }

    public static int disputa(String PC, String Pessoa){

        int resultado;

        if (PC.equals(Pessoa)){

            resultado = 0; // Empate

        } else if ((PC.equals("pedra") && Pessoa.equals("tesoura") ) ||
                (PC.equals("papel") && Pessoa.equals("pedra")) ||
                (PC.equals("tesoura") && Pessoa.equals("papel")))
        {
            resultado = 1; // Maquina
        } else {
            resultado = 2; // Jogador
        }

        return resultado;
    }

}




