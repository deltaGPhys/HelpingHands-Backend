package models;

import com.example.CentralDEHelpingHands.entites.Recipient;
import com.example.CentralDEHelpingHands.entites.Request;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class RequestTest {
    private Request request;
    private Recipient recipient1, recipient2;

    @BeforeEach
    void setUp() {
        recipient1 = new Recipient();
        request = new Request(7L, LocalDate.of(2020, 3, 27), "Pick-up", "I need a prescription picked up", recipient1 );
    }

    @Test
    void getId() {
        Assertions.assertEquals(7L, request.getId());
    }

    @Test
    void setId() {
        request.setId(8L);
        Assertions.assertEquals(8L, request.getId());
    }

    @Test
    void getDatePosted() {
        Assertions.assertEquals(LocalDate.of(2020, 3, 27), request.getDatePosted());
    }

    @Test
    void setDatePosted() {
        request.setDatePosted(LocalDate.of(2020, 3, 25));
        Assertions.assertEquals(LocalDate.of(2020, 3, 25), request.getDatePosted());
    }

    @Test
    void getTypeOfRequest() {
        Assertions.assertEquals("Pick-up", request.getTypeOfRequest());
    }

    @Test
    void setTypeOfRequest() {
        request.setTypeOfRequest("Food Delivery");
        Assertions.assertEquals("Food Delivery", request.getTypeOfRequest());
    }

    @Test
    void getRequestDescription() {
        Assertions.assertEquals("I need a prescription picked up", request.getRequestDescription());
    }

    @Test
    void setRequestDescription() {
        request.setRequestDescription("I need a meal delivered");
        Assertions.assertEquals("I need a meal delivered", request.getRequestDescription());
    }

    @Test
    void getRecipient() {
        Assertions.assertEquals(recipient1, request.getRecipient());
    }

    @Test
    void setRecipient() {
        request.setRecipient(recipient2);
        Assertions.assertEquals(recipient2, request.getRecipient());
    }
}