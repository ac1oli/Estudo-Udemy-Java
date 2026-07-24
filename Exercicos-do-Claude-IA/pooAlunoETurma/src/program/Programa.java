package pooAlunoETurma.src.program;

import pooAlunoETurma.src.entities.Aluno;
import java.util.ArrayList;


public class Programa {
    public static void main(String[] args){


        Aluno a = new Aluno("Bruno");
        a.adicionarNota(10.0);
        a.adicionarNota(5.0);
        a.adicionarNota(6.0);
        a.adicionarNota(4.0);
        a.adicionarNota(10.0);

        Aluno b = new Aluno("Pedro");


        System.out.println(a.getNomeAluno() + a.getNotasAluno());
        System.out.println(a.calcularMedia());
        System.out.println();
        System.out.println(b.getNomeAluno() + b.getNotasAluno());
        System.out.println(b.calcularMedia());
    }
}
