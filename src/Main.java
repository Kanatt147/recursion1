import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Task 1
        System.out.println("Task 1:");
        RecursionAssignment.printDigits(5481);

        // Task 2
        System.out.println("\nTask 2:");
        int[] arr = {3, 2, 4, 1};
        System.out.println(RecursionAssignment.average(arr));

        // Task 3
        System.out.println("\nTask 3:");
        System.out.println(RecursionAssignment.isPrime(7, 2) ? "Prime" : "Composite");

        // Task 4
        System.out.println("\nTask 4:");
        System.out.println(RecursionAssignment.factorial(5));

        // Task 5
        System.out.println("\nTask 5:");
        System.out.println(RecursionAssignment.fibonacci(5));

        // Task 6
        System.out.println("\nTask 6:");
        System.out.println(RecursionAssignment.power(2, 10));

        // Task 7
        System.out.println("\nTask 7:");
        System.out.println("Enter 4 numbers:");
        RecursionAssignment.reversePrint(sc, 4);
        System.out.println();

        // Task 8
        System.out.println("\nTask 8:");
        System.out.println(RecursionAssignment.isDigitsOnly("123456", 0) ? "Yes" : "No");

        // Task 9
        System.out.println("\nTask 9:");
        System.out.println(RecursionAssignment.countChars("hello"));

        // Task 10
        System.out.println("\nTask 10:");
        System.out.println(RecursionAssignment.gcd(32, 48));

        sc.close();
    }
}