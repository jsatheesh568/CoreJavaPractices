package CoreJavaPractices.src.singleton;

public class SingletonFactory {
  public enum SingletonType {
    EAGER,
    LAZY
  }

  public static Singleton getSingleton(SingletonType type) {
    if (type == SingletonType.EAGER) {
      return EagerSingleton.getInstance();
    } else {
      return LazySingleton.getInstance();
    }
  }
}
