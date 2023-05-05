import java.util.LinkedList;
import java.util.List;

public class MainLkList {
    
    public static void main(String[] args) {
        
        //LinkeList armazena os valores, deixando referências para o proximo valor e para o antigo valor
       /*
        *10           20           30
        paris 20  10 Rome 30  20 London 40

       */
       //LinkedList demoram um pouco mais para exibir o elemento pois buscam a partir de referências, pega o elemento mais proximo e vai checando 1 por 1

        List<String> cities = new LinkedList<>();
        cities.add("Paris");
        cities.add("Rome");
        cities.add("Florence");
        cities.add("Venice");
        cities.add("London");
        cities.add("Petra");
        cities.add("Oslo");
        cities.add("Madrid");
        cities.add("Prague");
        cities.add("Dublin");
        cities.add("Athens");
        cities.add("MArseille");
        cities.add("Chicago");
        cities.add("Tokyo");

        System.out.println(cities.size());
        System.out.println(cities.get(5));
        System.out.println(cities.get(8));

        cities.set(2, "Naples");
        cities.remove(5);

    }

}
