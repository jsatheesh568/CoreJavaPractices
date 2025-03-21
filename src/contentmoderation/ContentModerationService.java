package CoreJavaPractices.src.contentmoderation;

import java.util.List;
import java.util.function.Predicate;

public class ContentModerationService {
  private final NotificationService notificationService;

  private static final List <String> BANNED_WORDS = List.of("idiot", "free cash", "spam");

  public ContentModerationService(NotificationService notificationService) {
    this.notificationService = notificationService;
  }

  public void moderateContent(UserPost post) {
    Predicate <String> containsBannedWords =
        content -> BANNED_WORDS.stream().anyMatch(content.toLowerCase()::contains);

    try {
      if (containsBannedWords.test(post.content())) {
        throw new ContentViolationException("❌ Inappropriate content detected: " + post.content());
      }
      System.out.println("✅ Post approved: " + post.content());
    } catch (ContentViolationException e) {
      notificationService.notifyAdmin(post, e.getMessage());
    }
  }
}
