package CoreJavaPractices.src.SHAS.homedevices;

public class SmartLight implements SmartDevice {
  private boolean isOn = false;

  @Override
  public void executeCommand(String command) {
    switch (command.toLowerCase()) {
      case "on" -> {
        isOn = true;
        System.out.println("💡 Light turned ON");
      }
      case "off" -> {
        isOn = false;
        System.out.println("💡 Light turned OFF");
      }
      default -> System.out.println("⚠️ Invalid command for Light");
    }
  }

  @Override
  public String getStatus() {
    return isOn ? "ON" : "OFF";
  }
}
