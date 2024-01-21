package models;

public class Titulo {
    public String nome;
    private int anoDeLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    } 
    
    public boolean getIncluidoPlano() {
        return incluidoPlano;
    }


    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }  
   


    public void exibeFichaTecnica() {
        System.out.println("Filme: " +  nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        nota += somaAvaliacoes;
        totalAvaliacoes++;
    }

    public double pegaMedia() {
        return somaAvaliacoes / totalAvaliacoes;
    }

   

    
}
