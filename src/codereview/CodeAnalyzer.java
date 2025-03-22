package CoreJavaPractices.src.codereview;

import java.util.List;
import java.util.stream.Collectors;

public class CodeAnalyzer {
  public List<String> analyzeCode(String code) {
    return List.of(
            checkSOLIDPrinciples(code), checkPerformanceIssues(code), checkSecurityRisks(code))
        .stream()
        .filter(issue -> !issue.isEmpty())
        .collect(Collectors.toList());
  }

  private String checkSOLIDPrinciples(String code) {
    return code.contains("new") && code.contains("instanceof")
        ? "❌ Violates Open-Closed Principle"
        : "";
  }

  private String checkPerformanceIssues(String code) {
    return code.contains("for (int i = 0; i < list.size(); i++)")
        ? "⚠️ Use Enhanced For Loop or Streams"
        : "";
  }

  private String checkSecurityRisks(String code) {
    return code.contains("password") ? "❌ Security Risk: Hardcoded Credentials" : "";
  }
}
