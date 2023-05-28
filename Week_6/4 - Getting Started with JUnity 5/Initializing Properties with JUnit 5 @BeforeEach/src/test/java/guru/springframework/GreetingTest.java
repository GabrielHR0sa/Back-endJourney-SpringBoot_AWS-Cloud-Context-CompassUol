package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingTest {
    private Greeting greeting;

    //executa esse metodo antes de todos os outros testes
    // greeting = new Greeting(); já esta sendo inicializado antes de cada teste
    // facilita a instanciação do objeto que se repete nos testes
    @BeforeEach
    void setup(){
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld2() {
        System.out.println(greeting.helloWorld("Gabriel"));

    }
}
