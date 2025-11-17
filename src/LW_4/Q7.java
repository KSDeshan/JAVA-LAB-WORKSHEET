package LW_4;

import java.util.Scanner;

public class Q7 {

    public static int countDigits(int number) {
        int count = 0;
        int n = Math.abs(number);

        if (n == 0) {
            return 1;
        }

        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter an integer (negative to stop): ");
            number = input.nextInt();

            if (number < 0) {
                System.out.println("Program terminated.");
                break;
            }

            int digits = countDigits(number);
            System.out.println("Number of digits: " + digits);
        }

        input.close();
    }
}
