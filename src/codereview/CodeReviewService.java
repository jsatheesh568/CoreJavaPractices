package CoreJavaPractices.src.codereview;

import java.util.List;

public class CodeReviewService {
  private final CodeAnalyzer codeAnalyzer = new CodeAnalyzer();

  public void reviewCode(String developer, String code) {
    if (code == null || code.trim().isEmpty()) {
      throw new CodeReviewException("❌ Code submission is empty!");
    }

    List<String> issues = codeAnalyzer.analyzeCode(code);

    if (issues.isEmpty()) {
      System.out.println("✅ Code Approved for " + developer);
    } else {
      System.out.println("🚨 Code Issues for " + developer + ":");
      issues.forEach(System.out::println);
    }
  }
}
