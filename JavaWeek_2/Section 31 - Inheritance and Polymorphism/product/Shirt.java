package product;

public class Shirt extends Product {// extends Product, referencia a classe pai de onde os atributos serão herdados

   private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}


    public Shirt(double price, String color, String brand, Size size) {
        super(price,color,brand);//chama os atributos da classe pai
        
        this.size = size;
    }


    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    //sobrescrevendo o metodo fold herdado do elemento pai
    @Override
    public void fold() {
    
        super.fold();//chama o metodo fold da classe pai atraves da super Keyword

        System.out.println("Lay shirt on a flat surface");
        System.out.println("Fold the shirt sideways");
        System.out.println("Bring sleeves in");
        System.out.println("Fold from bottom up\n");

    }

    //sobrescreve o metodo wear da classe pai
    @Override
    public void wear() {
        System.out.println("The " + this.size + " shirt suits you well");
    }

}