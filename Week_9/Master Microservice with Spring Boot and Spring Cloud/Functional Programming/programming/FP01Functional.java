package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {

      List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

      printAllNumbersListFunctional(numbers);
      printEvenNumbersListFunctional(numbers);

    }

    private static void print(int number) {
        System.out.println(number);
    }

    public static boolean isEven(int number){
        return number%2 == 0;
    }

    private static void printAllNumbersListFunctional(List<Integer> numbers) {
        System.out.println("All numbers---------------------------------");
        // What to do?
        // converting the numbers to a stream and then printing then with the reference
        numbers.stream()
            .forEach(FP01Functional::print);
    }

    private static void printEvenNumbersListFunctional(List<Integer> numbers) {
        System.out.println("Even numbers---------------------------------");
        // What to do?
        // converting the numbers to a stream and then printing then with the reference
        numbers.stream()
            .filter(FP01Functional:: isEven) //filter - only allow even numbers
                .forEach(FP01Functional::print); //method reference
                
    }

}
