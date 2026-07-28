package pooAlunoETurma.src.entities;

import java.util.ArrayList;

public class Turma {

    private String nomeTurma;
    private ArrayList<Aluno> alunos;   // repara: é uma lista de OBJETOS Aluno, não de nomes ou notas soltas

    public Turma(String nomeTurma){
        this.nomeTurma = nomeTurma;
        this.alunos = new ArrayList<>(); // turma nova começa sem nenhum aluno
    }

    public void adicionarAluno(Aluno aluno){   // parâmetro renomeado pra singular (era "alunos", confundia)
        this.alunos.add(aluno);                 // adiciona o objeto Aluno inteiro na lista da turma
    }

    public double calcularMediaGeral(){
        if (this.alunos.size() == 0){           // PROTEÇÃO que faltava: turma vazia não pode dividir por 0
            return 0;
        }

        double mediaGeral = 0;

        for (Aluno aluno : this.alunos){        // percorre cada ALUNO da turma
            mediaGeral += aluno.calcularMedia(); // pede pro PRÓPRIO aluno calcular a média dele
        }                                        // Turma não recalcula nada, só usa o resultado — delegação

        return mediaGeral / this.alunos.size();
    }

    public void listaAprovado(){
        for (Aluno aluno : this.alunos){
            if (aluno.calcularMedia() >= 6){
                System.out.println("Aluno " + aluno.getNomeAluno() + " Aprovado!");
                // a correção principal: "aluno.getNomeAluno()" pega o NOME (String)
                // "aluno" sozinho imprimiria o objeto cru (tipo "Aluno@1a2b3c"), porque
                // Java não sabe transformar um objeto em texto legível sem você mandar como
            }
        }
    }
}