package CoreJavaPractices.src.OOPS.Polymorphism;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PolymorpNumberFilter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter start of range: ");
            int start = sc.nextInt();
            System.out.print("Enter end of range: ");
            int end = sc.nextInt();

            // Create filters
            NumberFilter primeFilter = new PrimeNumberFilter(start, end);
            NumberFilter happyFilter = new HappyNumberFilter(start, end);

            // Print results
            printResults("Prime Numbers", primeFilter.filter());
            printResults("Happy Numbers", happyFilter.filter());
        } catch (InputMismatchException e) {
            System.err.println("Error: Please enter valid integers.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void printResults(String label, List <Integer> numbers) {
        System.out.println(label + ": " + (numbers.isEmpty() ? "None found" : numbers));
    }
}
