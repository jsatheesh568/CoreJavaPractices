package CoreJavaPractices.src.trafficmanagementsystem;

public abstract class TrafficLight {
    protected String location;
    protected int duration; // Duration in seconds

    public TrafficLight(String location, int duration) {
        this.location = location;
        this.duration = duration;
    }

    public abstract void adjustLightDuration(int vehicleCount);

    public void showLightStatus() {
        System.out.println("🚦 Light at " + location + " set for " + duration + " seconds.");
    }
}
