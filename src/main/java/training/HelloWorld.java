package training;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String message = "hello there";
        System.out.println(message);

        System.out.println("who there:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("from when");
        int yearOfBirth = scanner.nextInt();
        int age = 2022 - yearOfBirth;
        System.out.println("age: " + age);
    }
}
