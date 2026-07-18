package src;

public class Casting {
    public static void main(String[] args){
        int x;
        double y;

        x = 10;
        y = 2 * x;

        System.out.println(x);
        System.out.println((int)y); // colocando o tipo de variado antes dos parenteses, eu meio que consigo trocar o tipo da variavel temporariamente.
        System.out.println(y); // Pois aqui ela ja volta com o seu tipo normal
    }
}
