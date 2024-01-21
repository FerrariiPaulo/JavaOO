import models.CalculadoraTempo;
import models.Filme;
import models.Series;

public class main {
    public static void main(String[] args) {
      Filme meuFilme = new Filme();
      meuFilme.setNome("De Olhos Bem Fechado");
      meuFilme.setAnoDeLancamento(1999);
      meuFilme.setDuracaoMinutos(168);

      Filme thor = new Filme();
      thor.setNome("Thor");
      thor.setDuracaoMinutos(120);

      


      Series house = new Series();
      house.setNome("House");
      house.setMinutosEpisodio(40);;
      house.setEpisodiosTemporada(20);
      house.setTemporada(8);

      System.out.println(house.getDuracaoMinutos());

      CalculadoraTempo calculadora = new CalculadoraTempo();
      calculadora.inclui(meuFilme);
      calculadora.inclui(thor);
      System.out.println(calculadora.getTempoTotal());
    }

        
    

}
    

