package Models;

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
    }

    @Test
    void setId() {
    }

    @Test
    void getDatePosted() {
    }

    @Test
    void setDatePosted() {
    }

    @Test
    void getTypeOfRequest() {
    }

    @Test
    void setTypeOfRequest() {
    }

    @Test
    void getRequestDescription() {
    }

    @Test
    void setRequestDescription() {
    }

}