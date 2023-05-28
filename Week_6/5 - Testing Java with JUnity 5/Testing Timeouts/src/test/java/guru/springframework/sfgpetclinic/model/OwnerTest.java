package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OwnerTest {

    @Test
    void dependetAssertions(){
        Owner owner = new Owner(1l, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("121312311234");

        assertAll("Properties Test",
            ()-> assertAll("Person Properties",
                ()-> assertEquals("Joe", owner.getFirstName()),
                ()-> assertEquals("Buck", owner.getLastName())),
            ()-> assertAll("Owner Properties",
                ()-> assertEquals("Key West", owner.getCity()),
                ()-> assertEquals("121312311234", owner.getTelephone())
            ));

    }
}
