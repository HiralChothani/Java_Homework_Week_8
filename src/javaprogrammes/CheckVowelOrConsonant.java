package javaprogrammes;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 */
public class CheckVowelOrConsonant {

    public static void main(String[] args) {

        String character;

        System.out.println("Enter single character from alphabet : ");
        // Scanner declaration for reading input from console
        Scanner input = new Scanner(System.in);
        character = input.nextLine();

        // object creation to call instance method
        CheckVowelOrConsonant obj = new CheckVowelOrConsonant();
        obj.checkInput(character);
        input.close();
    }

    public void checkInput(String character) {
        // if-else condition
        if (character.length() == 1 && Character.isAlphabetic(character.charAt(0))) {
            char ch = Character.toLowerCase(character.charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Error");
        }

    }
}
