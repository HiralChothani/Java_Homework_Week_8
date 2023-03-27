package javaprogrammes;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 */
public class PrimeNumber {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        //capture the input in an integer
        int num = scan.nextInt();

        // object creation to call instance method
        PrimeNumber obj = new PrimeNumber();
        obj.calculation(num);

        scan.close();

    }

    public void calculation(int num) {
        int a;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            a = num % i;
            if (a == 0) {
                isPrime = false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}


