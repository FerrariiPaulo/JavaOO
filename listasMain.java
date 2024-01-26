import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import models.Filme;
import models.Series;
import models.Titulo;

public class listasMain {
    public static void main(String[] args) {
        Filme deOlhosBemFechados = new Filme("De Olhos Bem Fechado", 1999);
        deOlhosBemFechados.avalia(10);
        Filme thor = new Filme("Thor", 2009); 
        thor.avalia(5);
        Series house = new Series("House", 2004);
        var starWars4 = new Filme("Star Wars IV", 1977); 
        starWars4.avalia(8); 
        var titanic = new Filme("Titanic", 1999);  
        titanic.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(deOlhosBemFechados);
        lista.add(thor);
        lista.add(starWars4);
        lista.add(titanic);
        lista.add(house);

        lista.forEach(item -> System.out.println(item));

        System.out.println("Ordenado por título");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("Ordenando por ano");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

       
        
    }
}
