package CoreJavaPractices.src.String;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.print("Enter a string to find duplicate characters: ");
        String input = scanner.nextLine();

        // Step 2: Use Java 8 Streams to count occurrences of characters
        Map<Character, Long> charCountMap = input.chars()
                .mapToObj(c -> (char) c) // Convert IntStream to Stream<Character>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Step 3: Filter and display duplicate characters
        String duplicates = charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey().toString())
                .collect(Collectors.joining(", "));

        System.out.println("Duplicate characters: " + (duplicates.isEmpty() ? "No duplicates found." : duplicates));
    }
}

