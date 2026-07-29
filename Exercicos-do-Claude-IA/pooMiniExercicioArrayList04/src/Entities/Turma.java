package pooMiniExercicioArrayList04.src.Entities;

import java.util.ArrayList;

public class Turma {

    private String nomeTurma;
    private ArrayList<Aluno> alunos;

    public Turma(String nomeTurma){
        this.nomeTurma = nomeTurma;
        this.alunos = new ArrayList<>();
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAlunoATurma(Aluno aluno){
        this.alunos.add(aluno);
    }

    public double calcularMediaGeral(){
        double mediaGeral = 0;

        if (this.alunos.size() == 0){
            return mediaGeral;
        }

        for (Aluno aluno : this.alunos){
            mediaGeral += aluno.calcularMediaAluno();
        }

        mediaGeral /= this.alunos.size();


        return mediaGeral;
    }

    public void listaAprovados(){

        if (this.alunos.size() == 0) {
            System.out.println("Nenhum aluno cadastrado nessa turma");
        } else {

            for (Aluno aluno : this.alunos) {

                if (aluno.calcularMediaAluno() >= 6) {
                    System.out.printf("O aluno %s, foi APROVADO com a media: %.2f%n", aluno.getNomeAluno(), aluno.calcularMediaAluno());
                }

            }
        }



    }
}
