package javaprogrammes;

import java.util.Scanner;

/**
 * /**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class LeftAngleTriangle {

    public static void main(String args[]) {
        System.out.println("Enter number of rows to be printed");

        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        // object creation to call instance method
        LeftAngleTriangle obj = new LeftAngleTriangle();
        obj.printPattern(rows);
        scanner.close();
    }

    public void printPattern(int rows) {
        // for loop to print pattern
        for (int j = 1; j <= rows; j++) {
            for (int i = 1; i <= rows - j; i++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
