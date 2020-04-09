package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SendMailTest {
    private Contact testContact;
    //@Value("${emailPassword}")

    @BeforeEach
    void setUp() {
        testContact = new Contact(1L, "David", "Trombello", "davidtrom@hotmail.com", "302-588-9355", LocalDate.of(1982, 7,8), "I'm depressed", "Afternoon", "This Coronona Virus thing has really gotten me down");

    }

    @Test
    void sendMessage() {
        Assertions.assertEquals(true, SendMail.sendMessage(testContact.getEmail(), testContact.getFirstName(), testContact.getLastName(), testContact.getEmail(), testContact.getPhoneNum(), testContact.getBirthDate(), testContact.getReasonForContact(), testContact.getPreferredApptTime(), testContact.getMessage());
    }
}