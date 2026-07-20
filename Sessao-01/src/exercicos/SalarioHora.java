package src.exercicos;

import java.util.Locale;
import java.util.Scanner;

public class SalarioHora {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Numero do funcionario
        int numFuncionario;
        //Horas Trabalhadas
        double horaTabalhada;
        //Valor por hora trabalhada
        double valorHora;

        System.out.print("Digite o seu numero: ");
        numFuncionario = sc.nextInt();
        System.out.print("Digite as suas horas trabalhadas: ");
        horaTabalhada = sc.nextDouble();
        System.out.print("Digite o seu valor por hora trabalhada: ");
        valorHora = sc.nextDouble();

        double calculo = horaTabalhada * valorHora;

        System.out.println("NUMERO: " + numFuncionario);
        System.out.printf("SALARIO: R$ %.2f %n", calculo);

        sc.close();
    }
}
