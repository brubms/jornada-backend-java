package modulo3;

public class Musica {

    private String titulo;
    private String artista;
    private int duracaoSec;
    private int reproducao;

    public Musica(String titulo, String artista, int duracaoSec, int reproducao){
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSec = duracaoSec;
        this.reproducao = reproducao;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getArtista(){
        return this.artista;
    }
    public int getDuracaoSec(){
        return this.duracaoSec;
    }
    public int getReproducao(){
        return this.reproducao;
    }
    @Override 
    public String toString(){
        return "|Titulo: " + titulo + " |Artista: " + artista + " |Duração:  " + duracaoSec + " |Reproduções: " + reproducao;
    }



}
