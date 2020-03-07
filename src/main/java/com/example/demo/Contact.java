package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Contact {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNum;
    private LocalDate birthDate;
    private String reasonForContact;
    private String preferredApptTime;
    private String message;

    public Contact() {
    }

    public Contact(Long id, String firstName, String lastName, String email, String phoneNum, LocalDate birthDate, String reasonForContact, String preferredApptTime, String message) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.birthDate = birthDate;
        this.reasonForContact = reasonForContact;
        this.preferredApptTime = preferredApptTime;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getReasonForContact() {
        return reasonForContact;
    }

    public void setReasonForContact(String reasonForContact) {
        this.reasonForContact = reasonForContact;
    }

    public String getPreferredApptTime() {
        return preferredApptTime;
    }

    public void setPreferredApptTime(String preferredApptTime) {
        this.preferredApptTime = preferredApptTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
