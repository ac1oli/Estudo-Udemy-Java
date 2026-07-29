package pooMiniExercicioArrayList02.src.Entities;

public class Livro {
    private String nome;
    private boolean disponovel;

    public Livro(String nome, boolean disponovel){
        this.nome = nome;
        this.disponovel = disponovel;
    }

    public String getNome() {
        return nome;
    }

    public boolean getDisponivel(){
        return disponovel;
    }


    public void setDisponovel(boolean disponovel) {
        this.disponovel = disponovel;
    }
}
