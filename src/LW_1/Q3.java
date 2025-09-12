package LW_1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length in centimetres :");
        double cm = scanner.nextDouble();

        double totalInches = cm /2.54;

        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.printf("Length: %d feet %.2f inches", feet, inches);

        scanner.close();
    }


}
