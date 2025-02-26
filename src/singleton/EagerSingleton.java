package CoreJavaPractices.src.singleton;

public class EagerSingleton implements Singleton {
  // Step 1: Create a private static final instance (Eager Instantiation)
  private static final EagerSingleton INSTANCE = new EagerSingleton();

  // Step 2: Private constructor to restrict instantiation
  private EagerSingleton() {
    if (INSTANCE != null) {
      throw new IllegalStateException("Instance already created!");
    }
  }

  // Step 3: Public method to provide access to instance
  public static EagerSingleton getInstance() {
    return INSTANCE;
  }

  @Override
  public void showMessage() {
    System.out.println("Eager Singleton Instance: " + this.hashCode());
  }
}
