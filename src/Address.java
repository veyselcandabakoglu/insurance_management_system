public abstract class Address {
    
    private String country;
    private String city;
    private String town;
    private String street;
    private int no;

    public Address(String country, String city, String town, String street, int no) {
        super();
        this.country = country;
        this.city = city;
        this.town = town;
        this.street = street;
        this.no = no;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    
    
}
