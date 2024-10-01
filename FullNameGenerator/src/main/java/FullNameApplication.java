package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        boolean firstName = scanner.hasNextLine();

        System.out.print("Please enter your middle name (press enter if none): ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Please enter your last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Please enter your suffix (press enter if none): ");
        String suffix = scanner.nextLine().trim();

        if (!suffix.isEmpty()) {
            String fullName = ", " + suffix;

            System.out.println("Full name: " + fullName);
        }



    }
}
