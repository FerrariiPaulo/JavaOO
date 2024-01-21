package models;

public class Recomendacao {    

    public void filtra(Classificacao estrela) {
        if(estrela.getEstrelas() >= 4) {
            System.out.println("Está entre os melhores do momento");
        } else if(estrela.getEstrelas() >= 2) {
            System.out.println("Caindo no gosto das pessoas");
        } else {
            System.out.println("Não é uma boa recomendação");
        }
    }
}
