package pooMiniExercicioArrayList01.src.Program.Proces;

import java.util.ArrayList;

public class Carrinho {

    private String pessoa;
    //Passar a quardar os itens numa lista
    private ArrayList<Item> listaItens;

    public Carrinho(String pessoa){
        this.pessoa = pessoa;
        this.listaItens = new ArrayList<>();
    }

    public String getPessoa() {
        return pessoa;
    }

    //Metodo para adicionar item a lista de itens criado
    public void adicionarItem(Item item){
        this.listaItens.add(item);
    }

    public double calcularTotal(){

        if (this.listaItens.size() == 0){
            return 0;
        }

        double valorTotalCompra = 0;

        for (Item item : this.listaItens){
            valorTotalCompra += item.getPreco();
        }

        return valorTotalCompra;
    }





}
