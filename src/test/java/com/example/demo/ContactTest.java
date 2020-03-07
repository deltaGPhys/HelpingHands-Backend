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
        String expected = "DonnieDuck@gmail.com";
        String actual = contactTest.getEmail();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setEmail() {
        String expected = "DDuck@gmail.com";
        contactTest.setEmail(expected);
        String actual = contactTest.getEmail();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getPhoneNum() {
        String expected = "454-555-1976";
        String actual = contactTest.getPhoneNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPhoneNum() {
        String expected = "555-666-7890";
        contactTest.setPhoneNum(expected);
        String actual = contactTest.getPhoneNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getBirthDate() {
        LocalDate expected = LocalDate.of(1989, 7, 28);
        LocalDate actual = contactTest.getBirthDate();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setBirthDate() {
        LocalDate expected = LocalDate.of(1982, 7, 12);
        contactTest.setBirthDate(expected);
        LocalDate actual = contactTest.getBirthDate();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getReasonForContact() {
        String expected = "Anxiety";
        String actual = contactTest.getReasonForContact();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setReasonForContact() {
        String expected = "Depression";
        contactTest.setReasonForContact(expected);
        String actual = contactTest.getReasonForContact();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getPreferredApptTime() {
        String expected = "Afternoon";
        String actual = contactTest.getPreferredApptTime();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPreferredApptTime() {
        String expected = "Morning";
        contactTest.setPreferredApptTime(expected);
        String actual = contactTest.getPreferredApptTime();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMessage() {
        String expected = "I'm having panic attacks";
        String actual = contactTest.getMessage();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMessage() {
        String expected = "I can't sleep at night";
        contactTest.setMessage(expected);
        String actual = contactTest.getMessage();
        Assertions.assertEquals(expected, actual);
    }

}