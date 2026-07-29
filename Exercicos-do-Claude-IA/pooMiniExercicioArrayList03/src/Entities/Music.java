package pooMiniExercicioArrayList03.src.Entities;

public class Music {

    private String nome;
    private int duracaoMusicaSegundos;

    public Music(String nome, int duracaoMusicaSegundos){
        this.nome = nome;
        this.duracaoMusicaSegundos = duracaoMusicaSegundos;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoMusica() {
        return duracaoMusicaSegundos;
    }

    public String formatarDuracao(){

        int minutes = this.duracaoMusicaSegundos / 60;
        int seconds = this.duracaoMusicaSegundos % 60;

        return String.format("%02d:%02d", minutes,seconds);
    }
}
