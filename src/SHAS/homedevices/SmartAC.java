package CoreJavaPractices.src.SHAS.homedevices;

public class SmartAC implements SmartDevice {
  private int temperature = 24;

  @Override
  public void executeCommand(String command) {
    try {
      int temp = Integer.parseInt(command);
      temperature = temp;
      System.out.println("❄️ AC temperature set to " + temp + "°C");
    } catch (NumberFormatException e) {
      System.out.println("⚠️ Invalid temperature command");
    }
  }

  @Override
  public String getStatus() {
    return "Temperature: " + temperature + "°C";
  }
}
