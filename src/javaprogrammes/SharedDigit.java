package javaprogrammes;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {
        int modulusOne = a % 10;
        int modulusTwo = b % 10;
        int divisionOne = a / 10;
        int divisionTwo = b / 10;
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        } else if (a == b) {
            return true;
        } else if (modulusOne == modulusTwo) {
            return true;
        } else if (divisionOne == divisionTwo) {
            return true;
        } else if (divisionOne == modulusTwo) {
            return true;
        } else if (divisionTwo == modulusOne) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }
}

