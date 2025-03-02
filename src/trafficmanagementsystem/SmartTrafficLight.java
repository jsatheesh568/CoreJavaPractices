package CoreJavaPractices.src.trafficmanagementsystem;

public class SmartTrafficLight extends TrafficLight {

    public SmartTrafficLight(String location, int duration) {
        super(location, duration);
    }

    @Override
    public void adjustLightDuration(int vehicleCount) {
        this.duration = vehicleCount > 50 ? 90 : vehicleCount > 20 ? 60 : 30;
        System.out.println("🔄 Adjusted duration at " + location + ": " + this.duration + " seconds.");
    }
}
