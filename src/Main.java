import builder1.Account;
import builder1.Address;
import builder1.Name;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Name name = new Name.Builder()
                .firstName("John")
                .middleNames(Arrays.asList("Frederick"))
                .lastName("Doe")
                .build();

        Address address = new Address.Builder()
                .houseNumber(23)
                .street("Wall Street")
                .city("New York")
                .zipCode("123456789")
                .build();

        Account account = new Account.Builder()
                .id(1)
                .address(address)
                .name(name)
                .email("test@gmail.com")
                .build();

        System.out.println(account.getAddress().getStreet());
        System.out.println(account.getAddress().getCity());
    }
}
