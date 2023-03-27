package javaprogrammes;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class RightAngleTriangle {

    public static void main(String[] args) {
        System.out.println("Enter number of rows to be printed");
        // initializing scanner
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        RightAngleTriangle obj = new RightAngleTriangle();
        obj.printPattern(rows);

        // closing scanner
        scanner.close();
    }

    public void printPattern(int rows) { // no return type with parameter method
        int i;
        int j;
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
