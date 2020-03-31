package com.example.CentralDEHelpingHands.entities;


import com.example.CentralDEHelpingHands.validators.PasswordUtils;
import com.example.CentralDEHelpingHands.validators.PasswordValidator;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipient {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNum;
    @Email(regexp = "^[a-zA-Z0-9._%$!#+\\-]+@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$")
    private String email;
    private String password;
    private String salt;
    private String location;
    private String link;
    @OneToMany
    @JsonIgnore
    private List<Request> requests = new ArrayList<>(0);

    public Recipient() {
    }

    public Recipient(Long id, String firstName, String lastName, String phoneNum, String email, String password, String salt, String location, String link, List<Request> requests) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.password = password;
        this.salt = salt;
        this.location = location;
        this.link = link;
        this.requests = requests;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
            this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(PasswordValidator.validatePassword(password)) {
            String salt = PasswordUtils.getSalt(30);
            setSalt(salt);
            this.password = PasswordUtils.generateSecurePassword(password, salt);
        }
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }
}
