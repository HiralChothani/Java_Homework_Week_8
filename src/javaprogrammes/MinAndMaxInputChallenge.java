package javaprogrammes;
/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    // object creation in driver method
    public static void main(String[] args) {
        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();
        obj.inputAndCheckValue();
    }

    public void inputAndCheckValue() {
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;


        // Scanner initialization for reading input from console
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter number :");
            number = scanner.nextInt();
//            if(!scanner.hasNextInt())
//                break;

            // if condition
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

            System.out.println("Do you want to continue? : y/n");
            choice = scanner.next().charAt(0);
            // while loop
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Maximum number : " + max);
        System.out.println("Minimum number : " + min);

        scanner.close();
    }

}
