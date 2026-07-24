package pooProduto.src.program;

import pooProduto.src.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Fazendo um array de produtos pra num ter que criando esses arrays todos dentro do FOR e tbm criar varios arrays fora do codigo
        Produto[] produtos = {
                new Produto("Pera", 4.50, 3),
                new Produto("Banana", 2.50, 1),
                new Produto("Melao", 5.00, 2),
                new Produto("Mamao", 3.00, 6),
                new Produto("Uva", 7.30, 4)
        };

        //criei as variaveis onde iriam ficar armazenados os resultados
        double somaProduto = 0;
        double itemCaro = 0;
        String nomeProdutoCaro = "";

        //iniciei a Class produtos sem passar valor nenhum por conta do construtor padrao
        Produto pd;

        for(int i = 0; i < produtos.length; i++){


            //pra somar a quantidade total do estoque
            somaProduto += (produtos[i].getQuantidadeEstoque() * produtos[i].getPreco());

            //para validar qual item e qual valor do produto mais caro
            if (itemCaro < produtos[i].getPreco()){
                itemCaro = produtos[i].getPreco();
                nomeProdutoCaro = produtos[i].getNome();
            }

            //para validar se algum item esta abaixo de X quantidade no estoque
            if (produtos[i].getQuantidadeEstoque() < 3){
                System.out.println("Produto '" + produtos[i].getNome() + "' abaixo de 3 quantidades no estoque" );
            }

        }

        System.out.println("Valor total do estoque: R$ " + somaProduto);
        System.out.println("Item mais caro no estoque " + nomeProdutoCaro + " no valor de: R$ " + itemCaro);

    }
}
