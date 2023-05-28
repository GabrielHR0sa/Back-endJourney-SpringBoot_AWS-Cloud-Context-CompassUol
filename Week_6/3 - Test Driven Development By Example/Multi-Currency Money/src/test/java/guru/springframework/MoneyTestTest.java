package guru.springframework;

import org.junit.jupiter.api.Test;

public class MoneyTestTest {
    @Test
    void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

    private void assertEquals(int i, int amount) {
    }
}
