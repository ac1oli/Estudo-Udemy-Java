package pooProduto.src.entities;

public class Produto {

    //Atributos

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    //construtor
    public Produto(){

    }

    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //Emcapsulamento

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

}
