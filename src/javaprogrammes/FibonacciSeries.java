package javaprogrammes;

//    Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class FibonacciSeries {

    public static void main(String[] args) {
        // object creation to call instance method
        FibonacciSeries obj = new FibonacciSeries();
        obj.calculation();
    }

    public void calculation() {  // no return type no parameter method
        int maxNumber = 10, previousNumber = 0, nextNumber = 1;
        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

        int i = 1;
        //while loop
        while (i <= maxNumber) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }

    }
}
