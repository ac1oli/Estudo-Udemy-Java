package pooContaBancaria.src.program;

import pooContaBancaria.src.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta x = new Conta("Alexsandro", 1, 1000.00);
        Conta y = new Conta("Fred", 2, 200.00);

        x.exibirExtrato();
        y.exibirExtrato();
        System.out.println();

        System.out.println("Apos fazer um deposito: ");
        x.depositar(200.39);
        y.depositar(300.21);

        x.exibirExtrato();
        y.exibirExtrato();
        System.out.println();

        System.out.println("Apos realizar um saque: ");
        x.sacar(2000);
        y.sacar(100.21);

        x.exibirExtrato();
        y.exibirExtrato();
        System.out.println();

        System.out.println("Apos realizar outro saque: ");
        x.sacar(1000);
        y.sacar(100.21);

        x.exibirExtrato();
        y.exibirExtrato();
        System.out.println();


    }
}
