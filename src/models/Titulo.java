package models;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    public String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meTituloOmdb) {
        this.nome = meTituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meTituloOmdb.year());
        this.duracaoMinutos = Integer.valueOf(meTituloOmdb.runtime().substring(0, 2));

    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
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


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' + ", anoDeLancamento=" + anoDeLancamento + "," +
        "duração " + duracaoMinutos;
    }

   

    
}
