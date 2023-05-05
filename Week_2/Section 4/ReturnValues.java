public class ReturnValues {

    public static void main(String[] args) {
        double area1 = calculateArea(2.6, 5.5); // chama a função e os valors dentro dos parenteses passam os valores
        System.out.println("Area: " + area1);
       
        String englishExplanation = explainArea("English");
        System.out.println("Explain: " + englishExplanation);
        
        printArea(2.3 ,3.6);

    }

    public static double calculateArea(double lenght, double width) {
        if(lenght <=0 || width <= 0){
            System.out.println("Invalid Dimensions");
            System.exit(0);
        }
        double area = lenght * width;
        return area;
    }

    public static String explainArea(String language){
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
            default:
            return "Language is not available";
            }
    }

    //function void não retorna nenhum valor

    public static void printArea(double lenght, double width){

        double area = lenght * width;
        System.out.println("A rectangle with a lenght of " + lenght + " and a width of " + width + " has an area of " + area);

    }

}