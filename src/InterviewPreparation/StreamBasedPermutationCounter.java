package CoreJavaPractices.src.InterviewPreparation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class StreamBasedPermutationCounter {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter a string: ");
      String inputString = scanner.nextLine();

      Set<String> uniquePermutations = new HashSet<>();
      generatePermutations(inputString.toCharArray(), 0, uniquePermutations);

      // Print results using Java 8 Streams
      System.out.println("Total unique permutations: " + uniquePermutations.size());
      uniquePermutations.stream().sorted().forEach(System.out::println);
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
    /*
        Enter a string: tata
    Total unique permutations: 6
    aatt
    atat
    atta
    taat
    tata
    ttaa
         */
  }

  private static void generatePermutations(char[] chars, int index, Set<String> permutations) {
    if (index == chars.length) {
      permutations.add(new String(chars));
      return;
    }
    IntStream.range(index, chars.length)
        .forEach(
            i -> {
              swap(chars, i, index);
              generatePermutations(chars, index + 1, permutations);
              swap(chars, i, index);
            });
  }

  private static void swap(char[] chars, int i, int j) {
    char temp = chars[i];
    chars[i] = chars[j];
    chars[j] = temp;
  }
}
