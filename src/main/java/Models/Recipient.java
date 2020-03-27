package Models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class Recipient {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNum;
    @Email
    private String email;
    private String areaOfNeed;
    private String password;
    private String location;
    private String link;

    public Recipient() {
    }

    public Recipient(Long id, String firstName, String lastName, String phoneNum, String email, String areaOfNeed, String password, String location, String link) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.areaOfNeed = areaOfNeed;
        this.password = password;
        this.location = location;
        this.link = link;
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

    public String getAreaOfNeed() {
        return areaOfNeed;
    }

    public void setAreaOfNeed(String areaOfNeed) {
        this.areaOfNeed = areaOfNeed;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
