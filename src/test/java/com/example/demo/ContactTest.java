package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    private Contact contactTest;

    @BeforeEach
    void setUp() {
        contactTest = new Contact(1L, "Donald", "Duck", "DonnieDuck@gmail.com", "454-555-1976", LocalDate.of(1989,7,28), "Anxiety", "Afternoon", "I'm having panic attacks");
    }

    @Test
    void getId() {
        Long expected = 1L;
        Long actual = contactTest.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setId() {
        Long expected = 6L;
        contactTest.setId(6L);
        Long actual = contactTest.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getFirstName() {
        String expected = "Donald";
        String actual = contactTest.getFirstName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setFirstName() {
        String expected = "Mickey";
        contactTest.setFirstName(expected);
        String actual = contactTest.getFirstName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getLastName() {
        String expected = "Duck";
        String actual = contactTest.getLastName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setLastName() {
        String expected = "Mouse";
        contactTest.setLastName(expected);
        String actual = contactTest.getLastName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getEmail() {
    }

    @Test
    void setEmail() {
    }

    @Test
    void getPhoneNum() {
    }

    @Test
    void setPhoneNum() {
    }

    @Test
    void getBirthDate() {
    }

    @Test
    void setBirthDate() {
    }

    @Test
    void getReasonForContact() {
    }

    @Test
    void setReasonForContact() {
    }

    @Test
    void getPreferredApptTime() {
    }

    @Test
    void setPreferredApptTime() {
    }

    @Test
    void getMessage() {
    }

    @Test
    void setMessage() {
    }

}