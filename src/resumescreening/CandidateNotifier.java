package CoreJavaPractices.src.resumescreening;

import java.util.function.Consumer;

public class CandidateNotifier {
  private final Consumer<Resume> notificationMethod;

  public CandidateNotifier(Consumer<Resume> notificationMethod) {
    this.notificationMethod = notificationMethod;
  }

  public void notifyCandidate(Resume resume) {
    notificationMethod.accept(resume);
  }
}
