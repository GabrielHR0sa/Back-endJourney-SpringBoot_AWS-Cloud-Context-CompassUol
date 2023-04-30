import java.util.Scanner;

public class DiceJack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roll1 = rollDice();//numeros gerados pelo dado
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers vetween 1 and 6: ");

        int num1 = scanner.nextInt();//lê os numeros digitados
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // entra se algum numero digitado for menor que 1 ou maior que 6
        if (isLessThan1(num1, num2, num3) || isHigherTan6(num1, num2, num3)) {
            System.out.println("You entered numbers outside the valid range");
            System.exit(0);// shuts down the aplication
        }

        //soma os numeros digitados e os numeros gerados pelo dado
        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDiceRolls = roll1 + roll2 + roll3;

        System.out.println("\nYour numbers: ");
        System.out.println("N1: " + num1);
        System.out.println("N2: " + num2);
        System.out.println("N3: " + num3);
        System.out.println("\n--------------------------");
        System.out.println("\nDice numbers: ");
        System.out.println("N1: " + roll1);
        System.out.println("N2: " + roll2);
        System.out.println("N3: " + roll3);
        System.out.println("\n--------------------------");
        System.out.println("\n Your sum: " + sumOfNumbers + " Dice sum: " + sumOfDiceRolls);

        //exibe se o usuário ganhou ou perdeu
        if (userWon(sumOfNumbers, sumOfDiceRolls)) {

            System.out.println("\nCongrats, you won!!!");

        } else {
            System.out.println("\nBetter luck next time!");
        }

        scanner.close();
    }

    public static boolean isLessThan1(int num1, int num2, int num3) {
        //compara se os numeros digitados estão abaixo de 1
        return (num1 < 1 || num2 < 1 || num3 < 1);

    }

    public static boolean isHigherTan6(int num1, int num2, int num3) {
        //compara se os numeros digitados estão acima de 6
        return (num1 > 6 || num2 > 6 || num3 > 6);

    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        //compara se a soma dos numeros digitados é maior que a soma dos dados e se a soma dos numeros menos a soma do dado é menor que 3
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 3);

    }

    public static int rollDice() {

        /*
         * Inside the function
         * Define um gerador de numero aleatório entre 0 e 0.999...
         * coloco *6 para gerar de 0 a 6
         * somo com 1 para que o mínimo seja 1 e o máximo seja 6.99...
         * retorno o valor convertido para inteiro
         */

        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;

    }

}
