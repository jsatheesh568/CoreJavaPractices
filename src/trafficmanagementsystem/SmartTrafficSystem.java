package CoreJavaPractices.src.trafficmanagementsystem;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class SmartTrafficSystem {
  public static void main(String[] args) {
      ExecutorService executor = Executors.newCachedThreadPool();

      List<TrafficSensor> sensors = List.of(
              new TrafficSensor("Downtown", 25),
              new TrafficSensor("Highway", 60),
              new TrafficSensor("Suburbs", 10)
      );

      sensors.forEach(sensor -> executor.submit(() -> processTraffic(sensor)));

      executor.shutdown();
      try {
          executor.awaitTermination(5, TimeUnit.SECONDS);
      } catch (InterruptedException e) {
          System.err.println("❌ Error: " + e.getMessage());
          Thread.currentThread().interrupt(); // Restore interrupt status
      }
  }

    // Processing Traffic Data Using Streams (Java 8)
    private static void processTraffic(TrafficSensor sensor) {
        try {
            validateTrafficData(sensor);

            SmartTrafficLight light = new SmartTrafficLight(sensor.location(), 30);
            light.adjustLightDuration(sensor.vehicleCount());
            light.showLightStatus();

        } catch (TrafficException e) {
            System.err.println("⚠️ Traffic Error at " + sensor.location() + ": " + e.getMessage());
        }
    }

    // Using `this` for validation & exception handling
    private static void validateTrafficData(TrafficSensor sensor) throws TrafficException {
        if (sensor.vehicleCount() < 0) {
            throw new TrafficException("Invalid vehicle count at " + sensor.location());
        }
  }
}
