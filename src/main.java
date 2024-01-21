import models.CalculadoraTempo;
import models.Episodios;
import models.Filme;
import models.Recomendacao;
import models.Series;

public class main {
    public static void main(String[] args) {
      Filme meuFilme = new Filme();
      meuFilme.setNome("De Olhos Bem Fechado");
      meuFilme.setAnoDeLancamento(1999);
      meuFilme.setDuracaoMinutos(168);
      meuFilme.setTotalAvaliacoes(8);

      Filme thor = new Filme();
      thor.setNome("Thor");
      thor.setDuracaoMinutos(120);

      


      Series house = new Series();
      house.setNome("House");
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
      

    }

        
    

}
    

