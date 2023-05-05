public class Parameters {

    public static void main(String[] args) {

        calculateArea(2.6,5.5); // chama a função e os valors dentro dos parenteses passam os valores
        calculateArea(4.9,6.5);
        calculateArea(1.6,9.5);

    }

    public static void calculateArea(double lenght, double width){
        System.out.println("Area: " + (lenght * width) + " mts");
    }

}
