package models;

public class Series extends Titulo implements Classificacao {
    private int temporada;
    private int episodiosTemporada;
    private boolean ativa;
    private int minutosEpisodio;
    private int totalVisualizacoes;

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodiosTemporada() {
        return episodiosTemporada;
    }

    public void setEpisodiosTemporada(int episodiosTemporada) {
        this.episodiosTemporada = episodiosTemporada;
    }

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosEpisodio() {
        return minutosEpisodio;
    }
    
    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutosEpisodio = minutosEpisodio;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }
    
    @Override
    public int getDuracaoMinutos() {        
        return temporada * episodiosTemporada * minutosEpisodio;
    }

    @Override
    public int getEstrelas() {
        if(totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
