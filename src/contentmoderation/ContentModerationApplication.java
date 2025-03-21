package CoreJavaPractices.src.contentmoderation;

import java.util.List;

public class ContentModerationApplication {
  public static void main(String[] args) {
    ContentModerationService moderationService =
        new ContentModerationService(new NotificationService());

    List<UserPost> posts =
        List.of(
            new UserPost(1, "Alice", "This is a great product!"),
            new UserPost(2, "Bob", "You are an idiot!"),
            new UserPost(3, "Charlie", "Visit my site for free cash!"));

    for (UserPost post : posts) {
      moderationService.moderateContent(post);
    }
  }
}
