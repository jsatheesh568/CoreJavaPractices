package CoreJavaPractices.src.singleton;

public class LazySingleton implements Singleton {
  // Step 1: Create a private static instance (initialized to null)
  private static LazySingleton instance;

  // Step 2: Private constructor
  private LazySingleton() {
    if (instance != null) {
      throw new IllegalStateException("Instance already created!");
    }
  }

  // Step 3: Public method to provide access (Lazy Initialization)
  public static LazySingleton getInstance() {
    if (instance == null) { // Check if instance is null
      instance = new LazySingleton(); // Create instance
    }
    return instance;
  }

  @Override
  public void showMessage() {
    System.out.println("Lazy Singleton Instance: " + this.hashCode());
  }
}
