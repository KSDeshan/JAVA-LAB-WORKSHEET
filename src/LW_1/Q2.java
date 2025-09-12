package LW_1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String middleName;
        String lastName;

        System.out.print("Enter your first name :");
        firstName = scanner.next();

        System.out.print("Enter your middle name : ");
        middleName = scanner.next();

        System.out.print("Enter your last name: ");
        lastName = scanner.next();

        char middleInitial = middleName.charAt(0);

        System.out.println("Formatted Name: " + lastName + ", " + firstName + " " + middleInitial + ".");

        scanner.close();
    }
}
