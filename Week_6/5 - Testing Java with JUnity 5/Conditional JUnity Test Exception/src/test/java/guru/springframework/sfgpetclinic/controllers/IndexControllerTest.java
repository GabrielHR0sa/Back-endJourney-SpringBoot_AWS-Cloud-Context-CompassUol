package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

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

    @Disabled("Demo of timeout")
    @Test
    void testTimeout(){
        assertTimeout(Duration.ofMillis(100), ()->{
            Thread.sleep(2000);
        });
    }

    @Disabled("Demo of timeout")
    @Test
    void testTimeoutPrempt(){
        assertTimeoutPreemptively(Duration.ofMillis(100), ()->{
            Thread.sleep(2000);
            System.out.println("I got here 12135484321358");
        });
    }

    @Test
    void testAssumptionTrue(){
        assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }

    @Test
    void testAssumptionTrueAssumtionIsTrue(){
        assumeTrue("GURU".equalsIgnoreCase("GURU"));
    }

    
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testMeOnWindows(){
    }

   
    @Test
    @EnabledOnOs(OS.MAC)
    void testMeOnMac(){
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "jt")
    void testIfUserJT(){
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "fred")
    void testIfUserFred(){
    }

}
