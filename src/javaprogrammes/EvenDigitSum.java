package javaprogrammes;

public class EvenDigitSum {

    // with return type with parameter method
    public static int getEvenDigitSum(int number) {
        int digit;
        int sum = 0;

        // while loop
        while (number != 0) {
            digit = number % 10;

            if (digit % 2 == 0)
                sum = sum + digit;

            number = number / 10;

            if (digit < 0) {
                return -1;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}

