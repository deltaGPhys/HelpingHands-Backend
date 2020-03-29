package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
class Request {

    @Id
    private Long id;
    LocalDate datePosted;
    String typeOfRequest;
    String requestDescription;
    @ManyToOne
    @JsonIgnore
    private Recipient recipient;

    public Request() {
    }

    public Request(Long id, LocalDate datePosted, String typeOfRequest, String requestDescription, Recipient recipient) {
        this.id = id;
        this.datePosted = datePosted;
        this.typeOfRequest = typeOfRequest;
        this.requestDescription = requestDescription;
        this.recipient = recipient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDate datePosted) {
        this.datePosted = datePosted;
    }

    public String getTypeOfRequest() {
        return typeOfRequest;
    }

    public void setTypeOfRequest(String typeOfRequest) {
        this.typeOfRequest = typeOfRequest;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }
}
