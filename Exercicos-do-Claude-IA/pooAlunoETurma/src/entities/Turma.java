package pooAlunoETurma.src.entities;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nomeTurma;
    private ArrayList<Aluno> alunos;

    public Turma(String nomeTurma){
        this.nomeTurma = nomeTurma;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno alunos){
        this.alunos.add(alunos);
    }

    public double calcularMediaGeral(){
        double mediaGeral = 0;

        for(Aluno aluno : this.alunos){
            mediaGeral += aluno.calcularMedia();
        }

        return mediaGeral / this.alunos.size();
    }

    public void listaAprovado(){

        for (Aluno aluno : this.alunos){
            if (aluno.calcularMedia() >= 6){
                System.out.println("Aluno " + aluno + " Aprovado!");
            }
        }
    }

}
