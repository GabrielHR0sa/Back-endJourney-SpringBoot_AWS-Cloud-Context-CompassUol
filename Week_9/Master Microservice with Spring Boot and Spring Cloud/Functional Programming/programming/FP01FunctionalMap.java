package programming;

import java.util.List;

public class FP01FunctionalMap {

    public static void main(String[] args) {

      List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

      printAllNumbersListFunctional(numbers);
      printEvenNumbersListFunctional(numbers);
       printSquaresOfEvenNumbersListFunctional(numbers);

    }

    private static void print(int number) {
        System.out.println(number);
    }

    //public static boolean isEven(int number){
    //    return number%2 == 0;
    //}

    private static void printAllNumbersListFunctional(List<Integer> numbers) {
        System.out.println("\nAll numbers---------------------------------");
        // What to do?
        // converting the numbers to a stream and then printing then with the reference
        numbers.stream()
            .forEach(FP01FunctionalMap::print);
    }

    private static void printEvenNumbersListFunctional(List<Integer> numbers) {
        System.out.println("\nEven numbers---------------------------------");
        // What to do?
        // converting the numbers to a stream and then printing then with the reference
        numbers.stream()
            .filter(number -> number%2 == 0) //Lambda expression, dont need to write a lot of code, not even create a method isEven, just write lambda
                .forEach(FP01FunctionalMap::print); //method reference
                
    }

    private static void printSquaresOfEvenNumbersListFunctional(List<Integer> numbers) {
        System.out.println("\nSquares of Even numbers---------------------------------");
        numbers.stream()
            .filter(number -> number%2 == 0)
                .map(number -> number * number) 
                    .forEach(FP01FunctionalMap::print);
                
    }
}
