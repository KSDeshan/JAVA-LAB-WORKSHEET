package LW_2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--**Program to count digits of numbers**--");


        while (true) {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();

            if (num < 0) {     // stop if negative
                System.out.println("Program ended!");
                break;
            }

            int count = 0;

            if (num == 0) {
                count = 1;
            } else {
                if (num < 0) {
                    num = -num;
                }
                while (num > 0) {
                    num = num / 10;
                    count++;
                }
            }

            System.out.println("Number of digits = " + count);
        }

    }
}
