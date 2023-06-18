package programming;

import java.util.List;

public class FP01Exercices {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printOddNumbersListFunctional(numbers);
        printCubesOfOddNumbersListFunctional(numbers);

        List<String> courses = List.of("Spring", "Api", "Microsservices",
                "Aws", "Pcf", "Azure", "Spring Boot");

        System.out.println("\nAll the courses-----------------------------");
        courses.stream().forEach(System.out::println);

        System.out.println("\nOnly courses that contains the filter-----------------------------");
        courses.stream()
                .filter(course -> course.contains("Spring")).forEach(System.out::println);

        System.out.println("\nOnly courses that have more or iqual 4 chars-----------------------------");
        courses.stream()
                .filter(course -> course.length() >= 4).forEach(System.out::println);

        System.out.println("\nThe length of courses-----------------------------");
        courses.stream()
                .map(course ->course + " = " + course.length()).forEach(System.out::println);
        
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void printOddNumbersListFunctional(List<Integer> numbers) {
        System.out.println("\nOdd numbers---------------------------------");

        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(FP01Exercices::print);

    }

    private static void printCubesOfOddNumbersListFunctional(List<Integer> numbers) {
        System.out.println("\nCube of Odd numbers---------------------------------");

        numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number * number)
                .forEach(FP01Exercices::print);

    }

}
