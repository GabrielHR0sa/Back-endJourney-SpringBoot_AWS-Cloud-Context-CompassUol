import product.*;
import product.Shirt.Size;
public class Inheritance {
    
    public static void main(String[] args) {

        //facilita o reuso de código definindo atributos pai, que serão herdados pelos que possuirem referencia a ele
        
        Shirt shirt = new Shirt(10.99, "Red", "Nike", Size.SMALL);//puxa metodos da classe pai products e o size de seu proprio arquivo
        /*shirt.setSize(Size.SMALL);
        shirt.setBrand("NIKE");
        shirt.setPrice(49.99);
        shirt.setColor("Blue");*/

        shirt.fold();
        productStore(shirt);//chamando o polymorphism

        Pants pants = new Pants(79.99, "Black", "Levi's", 32, 32);//recebendo parametros do constructor
        /*pants.setWaist(32);
        pants.setLength(32);
        pants.setBrand("Levis's");
        pants.setPrice(79.99);
        pants.setColor("BLACK");*/

        pants.fold();
        productStore(pants);
    }

    //metodo para ambos os filhos / Polymorphism
    public static void productStore(Product product){
        System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + " Your total comes to " + product.getPrice());
        product.wear();//chama o metodo wear da classe pai
    }


    /* 
    public static void pantStore(Pants pants){
        System.out.println("Thank you for purchasing " + pants.getBrand() + " Pants." + " Your total comes to " + pants.getPrice());
    }

    public static void pantStore(Shirt shirt){
        System.out.println("Thank you for purchasing " + shirt.getBrand() + " Shirt." + " Your total comes to " + shirt.getPrice());
    }
    */
}
