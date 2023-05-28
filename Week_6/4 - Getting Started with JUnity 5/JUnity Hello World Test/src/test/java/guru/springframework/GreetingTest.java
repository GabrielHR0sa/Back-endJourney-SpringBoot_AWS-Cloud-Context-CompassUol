package guru.springframework;

import org.junit.jupiter.api.Test;

public class GreetingTest {
    @Test
    void testHelloWorld() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld2() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld("Gabriel"));

    }
}
