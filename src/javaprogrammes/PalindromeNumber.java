package javaprogrammes;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String args[]) {

        System.out.println("Please Enter a number : ");
        // scanner declaration
        Scanner scanner = new Scanner(System.in);
        int palindrome = scanner.nextInt();

        // If else to print number
        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome
                    + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome
                    + " is not a palindrome");
        }

        scanner.close();
    }

    /*
     * Java method to check if a number is palindrome or not
     */
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and the reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;


    }

}

