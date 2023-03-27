package javaprogrammes;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 */
public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int i = 1;
        int numberEntered;
        int sum = 0;
        System.out.println("Enter number # :" + i);
        //Initialize the scanner
        Scanner userInput = new Scanner(System.in);
        while (userInput.hasNextInt()) {
            numberEntered = userInput.nextInt();
            sum += numberEntered;

            i++;
            System.out.println("Enter number # " + i);

        }
        System.out.println("Invalid number");
        System.out.println("Sum = " + sum);

        userInput.close();

//        System.out.println("Enter your number");
//        if (userInput.hasNextInt()) {
//        int numberEntered = userInput.nextInt();
//        System.out.println("You entered an integer");
//    } else {
//        System.out.println("you didn't enter an integer");
//    }
    }

}
