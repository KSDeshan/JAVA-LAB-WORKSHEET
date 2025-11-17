package LW_4;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a power of 10 (ex:6, 9, 12, 15...):");
        int power = input.nextInt();

        String name;

        switch (power) {
            case 6:
                name = "Million";
                break;

            case 9:
                name = "Billion";
                break;

            case 12:
                name = "Trillion";
                break;

            case 15:
                name = "Quadrillion";
                break;

            case 18:
                name = "Quintillion";
                break;

            case 21:
                name = "Sextillion";
                break;

            case 30:
                name = "Nonillion";
                break;

            case 100:
                name = "Googol";
                break;

            default:
                name = "No corresponding word for this power of 10.";
        }

        System.out.println(name);

        input.close();
    }
}
