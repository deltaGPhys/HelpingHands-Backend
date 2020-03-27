package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolunteerTest {
    private Volunteer volunteer;

    @BeforeEach
    void setUp() {
        volunteer = new Volunteer(1L, "Jane", "Doe", "302-123-5556", "janedoe@gmail.com", "J@neDoe1", "www.linkedin.com/janedoe");
    }

    @Test
    void getId() {
        Assertions.assertEquals(1L, volunteer.getId());
    }

    @Test
    void setId() {
        volunteer.setId(6L);
        Assertions.assertEquals(6L, volunteer.getId());
    }

    @Test
    void getFirstName() {
        Assertions.assertEquals("Jane", volunteer.getFirstName());
    }

    @Test
    void setFirstName() {
        volunteer.setFirstName("Sue");
        Assertions.assertEquals("Sue", volunteer.getFirstName());
    }

    @Test
    void getLastName() {
        Assertions.assertEquals("Doe", volunteer.getLastName());
    }

    @Test
    void setLastName() {
        volunteer.setLastName("Smith");
        Assertions.assertEquals("Smith", volunteer.getLastName());
    }

    @Test
    void getPhoneNum() {
        Assertions.assertEquals("302-123-5556", volunteer.getLastName());
    }

    @Test
    void setPhoneNum() {
        volunteer.setPhoneNum("302-555-3210");
        Assertions.assertEquals("302-555-3210", volunteer.getPhoneNum());
    }

    @Test
    void getEmail() {
        Assertions.assertEquals("janedoe@gmail.com", volunteer.getEmail());
    }

    @Test
    void setEmail() {
        volunteer.setEmail("suesmith@gmail.com");
        Assertions.assertEquals("suesmith@gmail.com", volunteer.getEmail());
    }

    @Test
    void getPassword() {
        Assertions.assertEquals("J@neDoe1", volunteer.getPassword());
    }

    @Test
    void setPassword() {
    }

    @Test
    void getLink() {
    }

    @Test
    void setLink() {
    }
}