package javaprogrammes;

public class DigitSumChallenge {

    // with return type with parameter method
    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }


    // Driver method
    public static void main(String[] args) {

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(-125));

    }
}

