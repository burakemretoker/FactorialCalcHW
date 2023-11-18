import java.util.Scanner;

// FactorialCalculator class to perform factorial calculations
class FactorialCalculator {
    // Method to calculate factorial
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

// Main class to interact with the user and utilize FactorialCalculator
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int userInput = scanner.nextInt();

        try {
            // Calculate factorial using FactorialCalculator class
            long result = FactorialCalculator.calculateFactorial(userInput);

            // Display the result
            System.out.println("The factorial of " + userInput + " is: " + result);
        } catch (IllegalArgumentException e) {
            // Handle the case where the user enters a negative number
            System.out.println("Error: " + e.getMessage());
        }
    }
}
