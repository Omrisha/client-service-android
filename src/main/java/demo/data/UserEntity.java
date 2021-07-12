package demo.data;

import demo.layout.UserBoundary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserEntity {
    private long id;
    private String email;
    private String firstName;
    private String lastName;
    private String cellphoneNumber;
    private int numberOfPeople;

    public UserEntity() {
    }

    public UserEntity(UserBoundary user) {
        if (user != null) {
            this.setEmail(user.getEmail());
            this.setFirstName(user.getFirstName());
            this.setLastName(user.getLastName());
            this.setCellphoneNumber(user.getCellphoneNumber());
            this.setNumberOfPeople(user.getNumberOfPeople());
        }
    }

    public UserEntity(long id, String email, String firstName, String lastName, String cellphoneNumber, int numberOfPeople) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellphoneNumber = cellphoneNumber;
        this.numberOfPeople = numberOfPeople;
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public UserBoundary toBoundary() {
        return new UserBoundary(this.getEmail(),
                this.getFirstName(),
                this.getLastName(),
                this.getCellphoneNumber(),
                this.getNumberOfPeople());
    }
}
