package javaprogrammes;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 */
public class PrintDiamondPattern {

    public static void main(String[] args) {

        System.out.print("Input number of rows (half of the diamond) : ");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();

        PrintDiamondPattern obj = new PrintDiamondPattern();
        obj.condition(r);

        // closing scanner
        in.close();
    }

    public void condition(int r) {
        // for loop to print pattern
        int i, j;
        for (i = 0; i <= r; i++) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (i = r - 1; i >= 1; i--) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}


