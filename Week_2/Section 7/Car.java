import java.util.Arrays;

public class Car {

    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    // constructor, define os parametros a serem recebidos dos novos objetos
    public Car(String make, double price, int year, String color, String[] parts) {

        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);

    }

    public Car(Car source) {
        // copia de outro construtor, recebe os parâmetros recebidos pelo novo carro na
        // Main
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    // getters são utilizados para retornar o campo do objeto que está privado
    // retornam uma copia de seu valor
    // assim como os get pegam os valores, os setters servem para pegar as mudanças
    // nos campos
    // botão direito -> javacode generators -> generate getters and setters

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public void drive() {
        System.out.println("\n You bought the beautiful " + year + " " + color + " " + make + " for " + price);
        System.out.println("\nPlease drive your car to the nearest exit. ");
    }

    public String toString() {
        //sobrescreve o metodo toString padrão para exibir o conteúdo que eu quero que seja exibido
        return "Make: " + this.make + ".\n"
                + "Price: " + this.price + ".\n"
                + "Year: " + this.year + ".\n"
                + "Color: " + this.color + ".\n"
                + "Parts: " + Arrays.toString(parts) + ".\n";

    }

}
