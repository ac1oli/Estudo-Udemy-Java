package pooProduto.src.program;

import pooProduto.src.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Iniciar os arrays dos prodrutos

        String[] nomes = {"Pera", "Banana", "Melao", "Mamao", "Uva"};
        double[] precos = {4.50 , 2.50 , 5.00, 3.00, 7.30};
        int[] quantidadeEstoque = {3, 1, 2, 6, 4};

        //criei as variaveis onde iriam ficar armazenados os resultados
        int somaProduto = 0;
        double itemCaro = 0;
        String nomeProdutoCaro = "";

        //iniciei a Class produtos sem passar valor nenhum por conta do construtor padrao
        Produto pd;

        for(int i = 0; i < nomes.length; i++){

            //Iniciei a class Produto com os calores dos arrays
            pd = new Produto(nomes[i], precos[i], quantidadeEstoque[i]);

            //pra somar a quantidade total do estoque
            somaProduto += pd.getQuantidadeEstoque();

            //para validar qual item e qual valor do produto mais caro
            if (itemCaro < pd.getPreco()){
                itemCaro = pd.getPreco();
                nomeProdutoCaro = pd.getNome();
            }

            //para validar se algum item esta abaixo de X quantidade no estoque
            if (pd.getQuantidadeEstoque() < 3){
                System.out.println("Produto '" + pd.getNome() + "' abaixo de 3 quantidades no estoque" );
            }

        }

        System.out.println("Valor total do estoque: " + somaProduto + " Itens");
        System.out.println("Item mais caro no estoque " + nomeProdutoCaro + " no valor de: R$ " + itemCaro);

    }
}
