package javaprogrammes;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class ArmstrongNumber {
    // Driver method
    public static void main(String[] args) {

        System.out.println("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // calling instance method
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.checkArmstrong(number);

        scanner.close();
    }

    public void checkArmstrong(int number) { // no return type with parameter method
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (; originalNumber != 0; originalNumber /= 10, ++n) ;

        originalNumber = number;

        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        // condition to check if number is Armstrong number
        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}





