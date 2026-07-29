package pooMiniExercicioArrayList02.src.Entities;

import java.util.ArrayList;

public class Biblioteca {
    private String nomeBiblioteca;
    private ArrayList<Livro> livros;

    public Biblioteca(String nomeBiblioteca){
        this.nomeBiblioteca = nomeBiblioteca;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void listaDisponivel(){
        if (livros.size() == 0){
            System.out.println("Sem livros nessa bibilioteca!");
        } else {
            int cont = 1;

            for (Livro livro : this.livros){
                if (livro.getDisponivel() == true){
                    System.out.println(cont + " - " + livro.getNome());
                }
                cont++;
            }
        }
    }

}
