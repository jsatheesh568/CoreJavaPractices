package CoreJavaPractices.src.SHAS.homedevices;

public class SmartLock implements SmartDevice {
  private boolean isLocked = true;

  @Override
  public void executeCommand(String command) {
    switch (command.toLowerCase()) {
      case "lock" -> {
        isLocked = true;
        System.out.println("🔒 Door Locked");
      }
      case "unlock" -> {
        isLocked = false;
        System.out.println("🔓 Door Unlocked");
      }
      default -> System.out.println("⚠️ Invalid command for Lock");
    }
  }

  @Override
  public String getStatus() {
    return isLocked ? "Locked" : "Unlocked";
  }
}
