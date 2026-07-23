package pooContaBancaria.src.entities;

public class Conta {

    //ATRIBUTOS
    private String titular;
    private int numeroConta;
    private double saldo;

    //CONSTRUTOR
    public Conta(String titular, int numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    //GET E SET
    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    //METODOS

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){

        if ((saldo - valor) < 0 ){
            System.out.println("Nao podemos realizar essa acao na conta do " + getTitular() +", pois nao se tem saldo suficiente!");
        } else {
            this.saldo -= valor;
        }

    }

    public void exibirExtrato(){
        System.out.printf("Saldo atual na conta do %s: R$ %.2f %n", getTitular(), getSaldo());
    }

}
