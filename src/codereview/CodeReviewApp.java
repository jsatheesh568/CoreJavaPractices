package CoreJavaPractices.src.codereview;

public class CodeReviewApp {
  public static void main(String[] args) {
    CodeReviewService reviewService = new CodeReviewService();

    String developerCode =
        "public class Sample { String password = '123'; for (int i = 0; i < list.size(); i++) {} }";

    try {
      reviewService.reviewCode("Alice", developerCode);
    } catch (CodeReviewException e) {
      System.out.println(e.getMessage());
    }
  }
}
