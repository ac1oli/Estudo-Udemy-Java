package pooMiniExercicioArrayList04.src.Program;

import pooMiniExercicioArrayList04.src.Entities.Aluno;
import pooMiniExercicioArrayList04.src.Entities.Turma;

public class Main {
    public static void main(String[] args) {

        // Teste 1: turma vazia, sem nenhum aluno
        Turma turmaVazia = new Turma("Turma Vazia");
        System.out.println("=== Teste 1: Turma vazia ===");
        System.out.println("Media geral: " + turmaVazia.calcularMediaGeral()); // esperado: 0.0
        turmaVazia.listaAprovados(); // esperado: "Nenhum aluno cadastrado nessa turma"

        System.out.println();

        // Teste 2: turma normal, com alunos aprovados, reprovados e um sem nota nenhuma
        Aluno joao = new Aluno("João");
        joao.adicionarNota(7.0);
        joao.adicionarNota(8.5);
        joao.adicionarNota(6.0); // media = 7.166...

        Aluno maria = new Aluno("Maria");
        maria.adicionarNota(9.0);
        maria.adicionarNota(9.5); // media = 9.25

        Aluno carlos = new Aluno("Carlos");
        carlos.adicionarNota(4.0);
        carlos.adicionarNota(5.5); // media = 4.75 -> reprovado

        Aluno ana = new Aluno("Ana"); // sem nenhuma nota -> media = 0 -> reprovado

        Aluno pedro = new Aluno("Pedro");
        pedro.adicionarNota(-5.0); // nota negativa, nao deveria entrar na lista
        pedro.adicionarNota(6.5);  // media deveria ser 6.5 (so essa nota valida)

        Turma turma = new Turma("3 Ano B");
        turma.adicionarAlunoATurma(joao);
        turma.adicionarAlunoATurma(maria);
        turma.adicionarAlunoATurma(carlos);
        turma.adicionarAlunoATurma(ana);
        turma.adicionarAlunoATurma(pedro);

        System.out.println("=== Teste 2: Turma com 5 alunos ===");
        System.out.printf("Media geral da turma: %.2f%n", turma.calcularMediaGeral());
        System.out.println("--- Aprovados ---");
        turma.listaAprovados();

        System.out.println();
        System.out.println("Media individual do Pedro (deveria ser 6.5, ignorando a nota negativa): "
                + pedro.calcularMediaAluno());
    }
}