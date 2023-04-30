import java.util.ArrayList;
import java.util.List;

public class MainArryList {
    
    public static void main(String[] args) {
        
        //Lista para armazenar elementos - tem a capacidade de aumentar seu tamanho
        //ArraysList são mais rápidas pra retornar um valor, pois buscam baseado no seu index
        
        List<String> cities = new ArrayList<>();
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
