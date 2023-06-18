package programming;

import java.util.List;

public class FP01FunctionalLambdaExpression {

    public static void main(String[] args) {

      List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

      printAllNumbersListFunctional(numbers);
      printEvenNumbersListFunctional(numbers);

    }

    private static void print(int number) {
        System.out.println(number);
    }

    //public static boolean isEven(int number){
    //    return number%2 == 0;
    //}

    private static void printAllNumbersListFunctional(List<Integer> numbers) {
        System.out.println("All numbers---------------------------------");
        // What to do?
        // converting the numbers to a stream and then printing then with the reference
        numbers.stream()
            .forEach(FP01FunctionalLambdaExpression::print);
    }

    private static void printEvenNumbersListFunctional(List<Integer> numbers) {
        System.out.println("Even numbers---------------------------------");
        // What to do?
        // converting the numbers to a stream and then printing then with the reference
        numbers.stream()
            .filter(number -> number%2 == 0) //Lambda expression, dont need to write a lot of code, not even create a method isEven, just write lambda
                .forEach(FP01FunctionalLambdaExpression::print); //method reference
                
    }

}
