package pooMiniExercicioArrayList04.src.Entities;

import java.util.ArrayList;

public class Aluno {

    //Atributos
    private String nomeAluno;
    private ArrayList<Double> notas;

    //Construtor
    public Aluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
        this.notas = new ArrayList<>();
    }

    //Encapsulamento
    public String getNomeAluno() {
        return nomeAluno;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    //Metodos

    public void adicionarNota(double nota){
        this.notas.add(nota);
    }


    public double calcularMediaAluno(){

        double mediaAluno = 0;

        if (this.notas.size() == 0){
            return 0;
        }

        for (double nota : this.notas){
            mediaAluno += nota;
        }

        mediaAluno /= this.notas.size();

        return mediaAluno;
    }


}
