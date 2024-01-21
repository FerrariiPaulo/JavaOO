package models;


public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }   

    // public void inclui(Filme f) {
    //     tempoTotal += f.getDuracaoMinutos();
    // }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoMinutos();
    }
}
