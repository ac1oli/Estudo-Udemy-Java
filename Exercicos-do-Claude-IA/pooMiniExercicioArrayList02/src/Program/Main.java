package pooMiniExercicioArrayList02.src.Program;

import pooMiniExercicioArrayList02.src.Entities.Biblioteca;
import pooMiniExercicioArrayList02.src.Entities.Livro;

import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Livro a = new Livro("Era uma vez", true);
        Livro b = new Livro("Turma da monica", true);
        Livro c = new Livro("Game Of Thrones", false);
        Livro d = new Livro("Naruto", true);

        Biblioteca biblioteca01 = new Biblioteca("Biblioteca-01");
        biblioteca01.adicionarLivro(a);
        biblioteca01.adicionarLivro(b);
        biblioteca01.adicionarLivro(c);
        biblioteca01.adicionarLivro(d);

        Biblioteca biblioteca02 = new Biblioteca("Biblioteca-02");
        biblioteca02.adicionarLivro(a);
        biblioteca02.adicionarLivro(c);
        biblioteca02.adicionarLivro(d);

        System.out.println(biblioteca01.getNomeBiblioteca());
        biblioteca01.listaDisponivel();
        System.out.println();
        System.out.println(biblioteca02.getNomeBiblioteca());
        biblioteca02.listaDisponivel();

        System.out.println();
        c.setDisponovel(true);
        System.out.println("Apos um livro voltar a estar disponivel");
        System.out.println();

        System.out.println(biblioteca01.getNomeBiblioteca());
        biblioteca01.listaDisponivel();
        System.out.println();
        System.out.println(biblioteca02.getNomeBiblioteca());
        biblioteca02.listaDisponivel();


    }
}
