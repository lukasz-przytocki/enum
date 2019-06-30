package zad2;

public class Address {
    private String city;
    private String street;
    private String zipCode;
    private String appartment;

    public Address(String city, String street, String zipCode, String appartment) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.appartment = appartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAppartment() {
        return appartment;
    }

    public void setAppartment(String appartment) {
        this.appartment = appartment;
    }
}
