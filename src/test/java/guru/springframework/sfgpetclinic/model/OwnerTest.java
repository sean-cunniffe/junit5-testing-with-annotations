package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertion() {
        Owner owner = new Owner(1l, "Sean", "Cunniffe");
        owner.setCity("Galway");
        owner.setTelephone("1234567890");

        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Sean", owner.getFirstName(), "First name didnt match"),
                        () -> assertEquals("Cunniffe", owner.getLastName(),"Last name didnt match"),
                () -> assertAll("Owner Properties Test",
                        () -> assertEquals("Sean", owner.getFirstName(),"First name didnt match"),
                        () -> assertEquals("Cunniffe", owner.getLastName(),"Last name didnt match"))
                ));
    }

}
