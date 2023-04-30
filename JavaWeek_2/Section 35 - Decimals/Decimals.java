import java.math.BigDecimal;

public class Decimals {
    public static void main(String[] args) {

        //BigDecimals providencia uma maior precisão, e representa todos os valores decimais

        BigDecimal x =new BigDecimal("0.1");

        System.out.println(x);

        BigDecimal y =new BigDecimal("0.2");
        
        System.out.println(x.add(y));
        System.out.println(x.subtract(y));

    }

}
