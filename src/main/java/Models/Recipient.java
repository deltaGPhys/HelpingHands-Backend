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

    public Recipient() {
    }

    public Recipient(Long id, String firstName, String lastName, String phoneNum, String email, String areaOfNeed, String password, String location) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.areaOfNeed = areaOfNeed;
        this.password = password;
        this.location = location;
    }
}
