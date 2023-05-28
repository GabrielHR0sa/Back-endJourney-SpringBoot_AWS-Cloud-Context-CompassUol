package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void groupedAssertions(){
        //given
        Person person = new Person(1l, "Joe", "Buck");

        //then
        assertAll("Test Props Set", 
        ()-> assertEquals(person.getFirstName(), "Joe"),
        ()-> assertEquals(person.getLastName(), "Buck"));
    }

    @Test
    void groupedAssertionsMsgs(){
        //given
        Person person = new Person(1l, "Joe", "Buck");

        //then
        assertAll("Test Props Set", 
        ()-> assertEquals(person.getFirstName(), "Joe", "First Name Failed"),
        ()-> assertEquals(person.getLastName(), "Buck", "Last Name Failed"));
    }
}
