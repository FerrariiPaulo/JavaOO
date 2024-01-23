import java.util.ArrayList;

import models.CalculadoraTempo;
import models.Episodios;
import models.Filme;
import models.Recomendacao;
import models.Series;

public class main {
    public static void main(String[] args) {
      Filme meuFilme = new Filme("De Olhos Bem Fechado", 1999); 
      meuFilme.setDuracaoMinutos(168);
      meuFilme.setTotalAvaliacoes(8);

      Filme thor = new Filme("Thor", 2009);     
      thor.setDuracaoMinutos(120);
      

      


      Series house = new Series("House", 2004);      
      house.setMinutosEpisodio(40);;
      house.setEpisodiosTemporada(20);
      house.setTemporada(8);
      house.setTotalVisualizacoes(300);

      System.out.println(house.getDuracaoMinutos());

      CalculadoraTempo calculadora = new CalculadoraTempo();
      calculadora.inclui(meuFilme);
      calculadora.inclui(thor);
      System.out.println(calculadora.getTempoTotal());

      Recomendacao filtro = new Recomendacao();
      filtro.filtra(meuFilme);

      Episodios episodio = new Episodios();
      episodio.setEpisodio(1);
      episodio.setSerie(house);
      filtro.filtra(house);

      var filme2 = new Filme("Star Wars IV", 1977);  
      filme2.setDuracaoMinutos(126);

      var filme3 = new Filme("Titanic", 1999);  
      filme3.setDuracaoMinutos(190);

      ArrayList<Filme> listaDeFilmes = new ArrayList<>();
      listaDeFilmes.add(meuFilme);
      listaDeFilmes.add(filme2);
      listaDeFilmes.add(filme3);
      System.out.println("Tamanho da lista " + listaDeFilmes.size());
      System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
      System.out.println(listaDeFilmes);
      System.out.println("toString do Filme: " + listaDeFilmes.get(0).toString());


      

    }

        
    

}
    

