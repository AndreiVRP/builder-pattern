package builder3;

public class Address {

    private int houseNumber;
    private String street;
    private String zipCode;
    private String city;

    private Address(Builder builder) {
        this.houseNumber = builder.houseNumber;
        this.street = builder.street;
        this.zipCode = builder.zipCode;
        this.city = builder.city;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public static class Builder {
        private int houseNumber;
        private String street;
        private String zipCode;
        private String city;

        public Builder houseNumber(final int houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder street(final String street) {
            this.street = street;
            return this;
        }

        public Builder zipCode(final String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder city(final String city) {
            this.city = city;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
