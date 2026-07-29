package pooMiniExercicioArrayList03.src.Entities;

import java.util.ArrayList;

public class Playlist {
    private String nome;
    private ArrayList<Music> musics;

    public Playlist(String nome){
        this.nome = nome;
        this.musics = new ArrayList<>();
    }

    public void adicionarMusicaPlayist(Music music){
        this.musics.add(music);
    }

    public String duracaoTotalPlaylist(){

        int totalTime = 0;

        for (Music music : this.musics){
            totalTime += music.getDuracaoMusica();
        }

        int hour = totalTime / 3600;
        int minutes = (totalTime % 3600) / 60;
        int seconds = totalTime % 60;

        return String.format("Time total this is playlist: %02d:%02d:%02d", hour,minutes,seconds);
    }

    public void listasMusicas(){
        for (Music music : this.musics){
            System.out.printf("%nMusic: %s %nTime: %s%n", music.getNome(), music.formatarDuracao());
        }
    }
}
