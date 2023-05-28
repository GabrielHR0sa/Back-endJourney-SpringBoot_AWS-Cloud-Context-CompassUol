package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IndexControllerTest {

    IndexController controller;
    
    @BeforeEach
    void setUp(){
        controller = new IndexController();
    }
    
    //@DisplayName nomeia o teste
    @DisplayName("Test Proper View name is returned for index page")
    @Test
    void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "Wrong View Return");

        assertEquals("index", controller.index(), ()-> "Another Expensive Message" +
        "Make me only if you have to");
    }

    @Test
    @DisplayName("Test Exception")
    void oupsHandler() {
        assertThrows(ValueNotFoundException.class, ()->{
            controller.oupsHandler();
        });
    }
}
