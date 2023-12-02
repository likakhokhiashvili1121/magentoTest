package utils;

public class CustomerAddress {

    private String phoneNumber;
    private String street;
    private String city;
    private String postalCode;
    private String country;

    public CustomerAddress(String phoneNumber, String street, String city, String postalCode, String country) {
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

}
