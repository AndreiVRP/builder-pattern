package builder3;

public class Account {
    private final int id;
    private final String email;
    private final Address address;
    private final Name name;

    public Account(AccountBuilder builder) {
        this.id = builder.getId();
        this.email = builder.getEmail();
        this.address = builder.getAddress();
        this.name = builder.getName();
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
