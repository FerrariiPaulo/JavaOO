package models;

public class Filme extends Titulo implements Classificacao {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
   
    @Override
    public int getEstrelas() {
        return (int) pegaMedia() / 2;
    }
        
} 
    

