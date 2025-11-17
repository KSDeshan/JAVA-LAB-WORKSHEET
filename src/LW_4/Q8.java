package LW_4;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to display its multiplication table: ");
        int N = input.nextInt();

        System.out.println("\nMultiplication Table of " + N + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        input.close();
    }
}
