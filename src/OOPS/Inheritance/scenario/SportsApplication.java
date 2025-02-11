package CoreJavaPractices.src.OOPS.Inheritance.scenario;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SportsApplication {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter scores for Hockey Team (11 space-separated integers):");
      int[] hockeyScores = readScores(scanner);

      System.out.println("Enter scores for Football Team (11 space-separated integers):");
      int[] footballScores = readScores(scanner);

      Sport sport = new Sport(hockeyScores, footballScores);

      displayResults(sport);
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
  }

  private static int[] readScores(Scanner scanner) {
    return IntStream.range(0, 11)
        .map(
            i -> {
              while (!scanner.hasNextInt()) {
                System.err.println("Invalid input! Please enter an integer.");
                scanner.next(); // Discard invalid input
              }
              return scanner.nextInt();
            })
        .toArray();
  }

  private static void displayResults(Sport sport) {
    System.out.println("Total Hockey Team Score: " + sport.calculateTotalHockeyScore());
    System.out.println("Total Football Team Score: " + sport.calculateTotalFootballScore());
    System.out.println("Highest Scorer in Hockey: " + sport.findHighestScorerInHockey());
    System.out.println("Highest Scorer in Football: " + sport.findHighestScorerInFootball());
    /*
    Enter scores for Hockey Team (11 space-separated integers):
    3 2 1 0 8 7 6 4 8 3 9
    Enter scores for Football Team (11 space-separated integers):
    0 8 3 4 8 12 13 9 2 3 1
    Total Hockey Team Score: 51
    Total Football Team Score: 63
    Highest Scorer in Hockey: 9
    Highest Scorer in Football: 13
         */
  }
}
