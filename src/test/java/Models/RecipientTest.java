package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


class RecipientTest {
    private Recipient recipient;
    private Request
    private List<Request> requestList;

    @BeforeEach
    void setUp() {

        recipient = new Recipient(2L, "Person", "InNeed", "302-555-9876", "helpme@gmail.com", "Password", "Hartley", "www.linkedin.com/davidtrom");
    }

    @Test
    void getId() {
        Assertions.assertEquals(2L, recipient.getId());
    }

    @Test
    void setId() {
        recipient.setId(5L);
        Assertions.assertEquals(5L, recipient.getId());
    }

    @Test
    void getFirstName() {
        Assertions.assertEquals("Person", recipient.getFirstName());
    }

    @Test
    void setFirstName() {
        recipient.setFirstName("John");
        Assertions.assertEquals("John", recipient.getFirstName());
    }

    @Test
    void getLastName() {
        Assertions.assertEquals("InNeed", recipient.getLastName());
    }

    @Test
    void setLastName() {
        recipient.setLastName("Doe");
        Assertions.assertEquals("Doe", recipient.getLastName());
    }

    @Test
    void getPhoneNum() {
        Assertions.assertEquals("302-555-9876", recipient.getPhoneNum());
    }

    @Test
    void setPhoneNum() {
        recipient.setPhoneNum("302-555-1234");
        Assertions.assertEquals("302-555-1234", recipient.getPhoneNum());
    }

    @Test
    void getEmail() {
        Assertions.assertEquals("helpme@gmail.com", recipient.getEmail());
    }

    @Test
    void setEmail() {
        recipient.setEmail("inNeed@gmail.com");
        Assertions.assertEquals("inNeed@gmail.com", recipient.getEmail());
    }

    @Test
    void getPassword() {
        Assertions.assertEquals("Password", recipient.getPassword());
    }

    @Test
    void setPassword() {
        recipient.setPassword("NewPassword");
        Assertions.assertEquals("NewPassword", recipient.getPassword());
    }

    @Test
    void getLocation() {
        Assertions.assertEquals("Hartley", recipient.getLocation());
    }

    @Test
    void setLocation() {
        recipient.setLocation("Magnolia");
        Assertions.assertEquals("Magnolia", recipient.getLocation());
    }

    @Test
    void getLink() {
        Assertions.assertEquals("www.linkedin.com/davidtrom", recipient.getLink());
    }

    @Test
    void setLink() {
        recipient.setLink("www.facebook.com/daveT");
        Assertions.assertEquals("www.facebook.com/daveT", recipient.getLink());
    }

    @Test
    void getRequests() {
    }

    @Test
    void setRequests() {
    }
}