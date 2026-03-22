public class RecursionAssignment {

    // Task 1
    public static void printDigits(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    // Task 2
    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + sumArray(arr, index + 1);
    }

    public static double average(int[] arr) {
        return (double) sumArray(arr, 0) / arr.length;
    }

    // Task 3
    public static boolean isPrime(int n, int divisor) {
        if (n <= 2) return (n == 2);
        if (n % divisor == 0) return false;
        if (divisor * divisor > n) return true;
        return isPrime(n, divisor + 1);
    }

    // Task 4
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Task 5
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Task 6
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Task 7
    public static void reversePrint(java.util.Scanner sc, int n) {
        if (n == 0) return;
        int x = sc.nextInt();
        reversePrint(sc, n - 1);
        System.out.print(x + " ");
    }

    // Task 8
    public static boolean isDigitsOnly(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isDigitsOnly(s, index + 1);
    }

    // Task 9
    public static int countChars(String s) {
        if (s.isEmpty()) return 0;
        return 1 + countChars(s.substring(1));
    }

    // Task 10
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}