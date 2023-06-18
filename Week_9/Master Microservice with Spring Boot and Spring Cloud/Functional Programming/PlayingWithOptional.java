import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {
    
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "coconut", "mango");
        
        //Optional returns a response case it exist, and return false case not
        Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional); //returns banana
        System.out.println(optional.isEmpty()); //returns false because banana exist
        System.out.println(optional.isPresent()); //return true because it have a value
        System.out.println(optional.get()); //return banana


    }

}
