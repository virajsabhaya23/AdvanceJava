package IO.ScannerEx;

import java.util.Scanner;

public class PersonCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter the naem : ");
//        String name = scanner.next();
//        System.out.println("Enter the age : ");
//        int age = scanner.nextInt();
//        System.out.println("Enter the phonenumber : ");
//        long phoneNumber = scanner.nextLong();
//OR
        System.out.println("Enter the name, age and phoneNumber : ");
        String name = scanner.next();
        int age = scanner.nextInt();
        long phoneNumber = scanner.nextLong();

        Person person = new Person(name,age,phoneNumber);
    }
}
