package models;

public class Episodios {
    private int episodio;
    private String nome;
    private Series serie;

    public int getEpisodio() {
        return episodio;
    }
    
    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }


}
