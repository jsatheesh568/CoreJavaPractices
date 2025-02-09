package CoreJavaPractices.src.String;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class RepeatedCharacterFinder {
  // First Repeated Character
  public Optional<Character> findFirstRepeatedCharacter(String input) {
    Set<Character> seenCharacters = new LinkedHashSet<>();
    return input
        .toLowerCase()
        .chars()
        .mapToObj(c -> (char) c)
        .filter(ch -> ch != ' ') // Ignore spaces
        .filter(ch -> !seenCharacters.add(ch))
        .findFirst();
  }

  // Last Repeated Character
  public Optional<Character> findLastRepeatedCharacter(String input) {
    Set<Character> seenCharacters = new HashSet<>();
    return IntStream.range(0, input.length())
        .mapToObj(i -> input.toLowerCase().charAt(input.length() - 1 - i)) // Process from end
        .filter(ch -> ch != ' ')
        .filter(ch -> !seenCharacters.add(ch))
        .findFirst();
  }

  // Middle Repeated Character (Approximate Middle)
  public Optional<Character> findMiddleRepeatedCharacter(String input) {
    Set<Character> seenCharacters = new HashSet<>();
    int middleIndex = input.length() / 2;

    return IntStream.concat(
            IntStream.range(middleIndex, input.length()), // Traverse from middle to end
            IntStream.range(0, middleIndex) // Then from start to middle
            )
        .mapToObj(i -> input.toLowerCase().charAt(i))
        .filter(ch -> ch != ' ')
        .filter(ch -> !seenCharacters.add(ch))
        .findFirst();
  }

  // All Repeated Characters
  public List<Character> findAllRepeatedCharacters(String input) {
    Set<Character> seenCharacters = new HashSet<>();
    return input
        .toLowerCase()
        .chars()
        .mapToObj(c -> (char) c)
        .filter(ch -> ch != ' ')
        .filter(ch -> !seenCharacters.add(ch))
        .distinct()
        .collect(Collectors.toList());
  }
}

public class FirstRepeatedCharacterApplication {

  public static void main(String[] args) {
    RepeatedCharacterFinder finder = new RepeatedCharacterFinder();
    String input = "Tata Consultancy Services, Belgium";

    finder
        .findFirstRepeatedCharacter(input)
        .ifPresentOrElse(
            ch -> System.out.println("First Repeated Character: " + ch),
            () -> System.out.println("No Repeated Character Found"));

    finder
        .findLastRepeatedCharacter(input)
        .ifPresentOrElse(
            ch -> System.out.println("Last Repeated Character: " + ch),
            () -> System.out.println("No Repeated Character Found"));

    finder
        .findMiddleRepeatedCharacter(input)
        .ifPresentOrElse(
            ch -> System.out.println("Middle Repeated Character: " + ch),
            () -> System.out.println("No Repeated Character Found"));

    List<Character> allRepeatedCharacters = finder.findAllRepeatedCharacters(input);
    System.out.println("All Repeated Characters: " + allRepeatedCharacters);
    /*
         String input = "Tata Consultancy Services, Belgium";
        First Repeated Character: t
        Last Repeated Character: e
        Middle Repeated Character: e
        All Repeated Characters: [t, a, n, c, s, e, l, i, u]
         */
  }
}
