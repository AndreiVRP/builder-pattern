package builder3;

public class AccountBuilder {

    private int id;
    private String email;
    private Address address;
    private Name name;



    public AccountBuilder id(final int id) {
        this.id = id;
        return this;
    }

    public AccountBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public AccountBuilder address(final Address address) {
        this.address = address;
        return this;
    }

    public AccountBuilder name(final Name name) {
        this.name = name;
        return this;
    }

    public Account build() {
        return new Account(this);
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public Name getName() {
        return name;
    }

}