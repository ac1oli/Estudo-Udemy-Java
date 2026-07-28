package pooMiniExercicioArrayList01.src.Program;

import pooMiniExercicioArrayList01.src.Entities.Carrinho;
import pooMiniExercicioArrayList01.src.Entities.Item;

public class Main {
    public static void main(String[] args){

        Item a = new Item("Mouse", 200.00);
        Item b = new Item("Teclado", 250.00);
        Item c = new Item("Headset", 150.00);
        Item d = new Item("Monitor", 900.00);

        Carrinho carrinho1 = new Carrinho("Bruno");
        Carrinho carrinho2 = new Carrinho("Paulo");
        Carrinho carrinho3 = new Carrinho("Alex");

        carrinho1.adicionarItem(a);
        carrinho1.adicionarItem(b);
        carrinho1.adicionarItem(c);
        carrinho1.adicionarItem(d);

        carrinho2.adicionarItem(a);
        carrinho2.adicionarItem(b);

        System.out.println("O carrinho do(a) " + carrinho1.getPessoa() + " deu um total de: R$ " + carrinho1.calcularTotal());

        System.out.println("O carrinho do(a) " + carrinho2.getPessoa() + " deu um total de: R$ " + carrinho2.calcularTotal());

        System.out.println("O carrinho do(a) " + carrinho3.getPessoa() + " deu um total de: R$ " + carrinho3.calcularTotal());



    }
}
