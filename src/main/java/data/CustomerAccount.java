package data;

import com.github.javafaker.Faker;

public class CustomerAccount {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public CustomerAccount(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    public static CustomerAccount createFakeAccount() {
        Faker faker = new Faker();
        return new CustomerAccount(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.internet().password(8, 10, true, true));
    }
}