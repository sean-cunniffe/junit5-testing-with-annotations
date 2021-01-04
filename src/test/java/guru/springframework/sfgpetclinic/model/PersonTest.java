package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        Person person = new Person(1l, "Sean", "Cunniffe");

        assertAll("Test Props set",
                () -> assertEquals("Sean", person.getFirstName(), "First name test failed"),
                () -> assertEquals("Cunniffe", person.getLastName(), "Last name test failed"));
    }

}
