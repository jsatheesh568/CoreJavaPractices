package CoreJavaPractices.src.OOPS.Inheritance.scenario;

import java.util.Arrays;
import java.util.stream.IntStream;

class Sport implements HockeyTeam, FootballTeam {
  private final int[] hockeyPlayerScores;
  private final int[] footballPlayerScores;

  // LSP Compliance: Validates constructor inputs
  public Sport(int[] hockeyScores, int[] footballScores) {
    validateTeamScores(hockeyScores, "Hockey");
    validateTeamScores(footballScores, "Football");

    this.hockeyPlayerScores = Arrays.copyOfRange(hockeyScores, 0, 11);
    this.footballPlayerScores = Arrays.copyOfRange(footballScores, 0, 11);
  }

  private void validateTeamScores(int[] scores, String teamName) {
    if (scores == null) {
      throw new IllegalArgumentException(teamName + " team scores cannot be null.");
    }
    if (scores.length < 11) {
      throw new IllegalArgumentException(teamName + " team must have at least 11 players.");
    }
  }

  @Override
  public int calculateTotalHockeyScore() {
    return IntStream.of(hockeyPlayerScores).sum();
  }

  @Override
  public int calculateTotalFootballScore() {
    return IntStream.of(footballPlayerScores).sum();
  }

  @Override
  public int findHighestScorerInHockey() {
    return IntStream.of(hockeyPlayerScores).max().orElse(0);
  }

  @Override
  public int findHighestScorerInFootball() {
    return IntStream.of(footballPlayerScores).max().orElse(0);
  }
}
