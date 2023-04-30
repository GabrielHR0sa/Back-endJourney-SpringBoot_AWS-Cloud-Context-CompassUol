import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "red", new String[] { "tires", "keys" }),
                new Car("Dodge", 8500, 2019, "blue", new String[] { "tires", "keys" }),
                new Car("Nissan", 5000, 2017, "yellow", new String[] { "tires", "filter" }),
                new Car("Honda", 7000, 2019, "orange", new String[] { "tires", "filter" }),
                new Car("Mercedes", 12000, 2015, "jet black", new String[] { "tires", "filter", "transmission" })
        };

        DealerShip dealership = new DealerShip(cars);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealership);
        System.out.println("Which car are you interested in? (0 – 4).\n");
        int index = scan.nextInt();

        dealership.sell(index);

        scan.close();

        /*
         * nissan2.setColor("Yellow");
         * nissan2.drive();
         */

        /*
         * nissan.setColor("Jet Black");//usa o metodo set para trocar a cor
         * dodge.setColor("Jet Black");
         * 
         * nissan.setPrice(nissan.getPrice()/2);//usa o metodo set para alterar o preço
         * dodge.setPrice(dodge.getPrice()/2);
         */

        /*
         * System.out.println("This " + nissan.getMake() + " is worth $" +
         * nissan.getPrice() +
         * ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() +
         * ".\n");
         * System.out.println("This " + dodge.getMake() + " is worth $" +
         * dodge.getPrice() +
         * ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() +
         * ".\n");
         * 
         */

    }

}
