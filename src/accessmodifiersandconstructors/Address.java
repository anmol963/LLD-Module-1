package accessmodifiersandconstructors;

public class Address {

    int houseNumber;
    String street;
    String city;
    String state;
    String zip;

    Address(int houseNumber, String street, String city, String state, String zip) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
