package pooMiniExercicioArrayList03.src.Program;

import pooMiniExercicioArrayList03.src.Entities.Music;
import pooMiniExercicioArrayList03.src.Entities.Playlist;

public class Main {
    public static void main(String[] args){
        Music m = new Music("Teste", 255);
        Music a = new Music("Teste1", 655);
        Music b = new Music("Teste2", 455);
        Music c = new Music("Teste3", 915);
        Music d = new Music("Teste4", 855);
        Music e = new Music("Teste5", 1055);
        Playlist teste = new Playlist("teste");

        teste.adicionarMusicaPlayist(m);
        teste.adicionarMusicaPlayist(a);
        teste.adicionarMusicaPlayist(b);
        teste.adicionarMusicaPlayist(c);
        teste.adicionarMusicaPlayist(d);
        teste.adicionarMusicaPlayist(e);



        System.out.println(teste.duracaoTotalPlaylis());
        teste.listasMusicas();
    }
}
