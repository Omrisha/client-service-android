package demo.layout;


public class UserBoundary {
    private String email;
    private String firstName;
    private String lastName;
    private int cellphoneNumber;
    private int numberOfPeople;

    public UserBoundary() {}

    public UserBoundary(String email, String firstName, String lastName, int cellphoneNumber, int numberOfPeople) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellphoneNumber = cellphoneNumber;
        this.numberOfPeople = numberOfPeople;
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

    public int getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(int cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}
