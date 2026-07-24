package pooAlunoETurma.src.entities;

import java.util.ArrayList;

public class Aluno {
    private String nomeAluno;
    private ArrayList<Double> notasAluno;

    public Aluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
        this.notasAluno = new ArrayList<>();
    }

    public ArrayList<Double> getNotasAluno() {
        return notasAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    //METODOS

    public void adicionarNota(double notaAluno){
        if (notaAluno >= 0){
            this.notasAluno.add(notaAluno);
        }
    }

    public double calcularMedia(){
        if (getNotasAluno().size() > 0){
            double media = 0;

            for (double nota : getNotasAluno()){
                media += nota;
            }
            return media / getNotasAluno().size();
        }

        return 0;
    }
}
