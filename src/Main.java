
import builder1.Account;
import builder1.Address;
import builder1.Name;
import builder2.OldRobotBuilder;
import builder2.Robot;
import builder2.RobotBuilder;
import builder2.RobotEngineer;
import builder3.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       builder1Example();
       builder2Example();
       builder3Example();
    }

    private static void builder1Example() {
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

    private static void builder2Example() {
        RobotBuilder oldRobotBuilder = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldRobotBuilder);
        robotEngineer.makeRobot();
        Robot firsRobot = robotEngineer.getRobot();
        System.out.println("Robot head: " + firsRobot.getRobotHead());
        System.out.println("Robot torso: " + firsRobot.getRobotTorso());
        System.out.println("Robot arms: " + firsRobot.getRobotArms());
        System.out.println("Robot legs: " + firsRobot.getRobotLegs());
    }

    private static void builder3Example() {
        builder3.Name name = new builder3.Name.Builder()
                .firstName("John")
                .middleNames(Arrays.asList("Frederick"))
                .lastName("Doe")
                .build();

        builder3.Address address = new builder3.Address.Builder()
                .houseNumber(23)
                .street("Wall Street 3")
                .city("New York 3")
                .zipCode("123456789")
                .build();

        builder3.Account account = new AccountBuilder()
                .id(1)
                .address(address)
                .name(name)
                .email("test@gmail.com")
                .build();

        System.out.println(account.getAddress().getStreet());
        System.out.println(account.getAddress().getCity());
    }


}
