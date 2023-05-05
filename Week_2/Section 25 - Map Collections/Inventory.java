/*
 * HashMap
 * Guardam as informaç~eos em keys, e guardam referências assim como as LinkedLists
 * Vão de refrência em referência
 * providencia buscas rápidas, localiza as chaves por index
 */

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    public static void main(String[] args) {
        Map<String, Double> inventory = new HashMap<>();

        inventory.put("Banana", 2.99);// inserindo elementos no hashMap
        inventory.put("Papaya", 5.99);
        inventory.put("Kale", 4.99);
        inventory.put("Apples", 1.99);
        inventory.put("Carrot", 1.49);

        inventory.put("Lime", 0.49);
        inventory.put("Toothpaste", 5.99);
        inventory.put("Zucchini", 5.99);

        System.out.println("\nWelcome to Java Grocers, Wath can we help you find?:");

        System.out.println("\nWhat is the price of Lime?");
        System.out.println(inventory.get("Lime"));// busca a key Lime e exibe sua informação

        System.out.println("\nWhat is the price of Zucchini?");
        System.out.println(inventory.get("Zucchini"));

        System.out.println("\nWhat is the price of Kale?");
        System.out.println(inventory.get("Kale"));

        System.out.println("\nDo you guys sell Apples?");
        boolean result = inventory.containsKey("Apples");// containsKey, serve para buscar a chave assim como o get, mas
                                                         // ele retorna true or false através da busca pela chave
        String response = result ? "Yes" : "No, sorry";// Se o result for verdadeiro, devolve yes, caso seja falso,
                                                       // devolve no,sorry
        // ? : abreviação para if e else, (?) if e else (:)
        System.out.println(response);
    }

}
