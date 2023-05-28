package guru.springframework;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class MoneyTestTest {
    @Test
    void testTestMultiplication() {

        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertEquals(new Dollar(5), new Dollar(8));
    }
}
