import java.util.Scanner;

public class OtherAlgorithm {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = Integer.parseInt(askForInput("Enter a number for its factorial to be calculated: "));
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static String askForInput(String message) {
        System.out.println(message);
        String inp = scanner.nextLine();
        return inp;
    }
}