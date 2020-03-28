package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RequestTest {
    private Request request;

    @BeforeEach
    void setUp() {
        request = new Request(7L, LocalDate.of(2020, 3, 27), "Pick-up", "I need a prescription picked up");
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

}