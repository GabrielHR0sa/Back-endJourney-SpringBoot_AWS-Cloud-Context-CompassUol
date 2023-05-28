package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingTest {
    private Greeting greeting;
    
    //executa o metodo antes de todos os testes, somente uma vez no inicio
    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before - I am only called Once!!!");
    }

    //executa esse metodo antes de cada um dos testes
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

    @AfterEach
    void tearDown(){
        System.out.println("In after Each...");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("After - I am only called Once!!!");
    }

}
