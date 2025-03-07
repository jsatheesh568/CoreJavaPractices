package CoreJavaPractices.src.SHAS.service;

import CoreJavaPractices.src.SHAS.exception.DeviceNotFoundException;
import CoreJavaPractices.src.SHAS.homedevices.SmartDevice;

import java.util.HashMap;
import java.util.Map;

public class SmartHomeService {
  private final Map<String, SmartDevice> devices = new HashMap<>();

  public void addDevice(String name, SmartDevice device) {
    devices.put(name.toLowerCase(), device);
  }

  public void executeCommand(String deviceName, String command) throws DeviceNotFoundException {
    SmartDevice device = devices.get(deviceName.toLowerCase());
    if (device == null) throw new DeviceNotFoundException("❌ Device " + deviceName + " not found.");
    device.executeCommand(command);
  }

  public void showDeviceStatus() {
    devices.forEach((name, device) -> System.out.println(name + " Status: " + device.getStatus()));
  }
}
