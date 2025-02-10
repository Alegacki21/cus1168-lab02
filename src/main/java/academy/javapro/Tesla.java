package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    // TODO: Create constructor that takes model and year

    public Tesla(String model, int year) {
        super("Tesla", model, year, false);
        this.autopilotEnabled = false;
        this.charging = false;
    }

    // TODO: Set make to "Tesla"

    @Override
    public void setMake(String make) {
        this.make = "Tesla";
    }

    // TODO: Initialize autopilotEnabled and charging to false
    // TODO: Implement all required methods from Vehicle, Electric, and Autonomous

    @Override
    public void startEngine() {
        isRunning = true;
        System.out.println("Tesla " + model + " started");
    }

    @Override
    public void stopEngine() {
        isRunning = false;
        System.out.println("Tesla " + model + " stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Tesla " + model + " is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Tesla " + model + " is braking...");
    }

    @Override
    public void charge() {
        charging = true;
        System.out.println("Tesla " + model + " is now charging");
    }

    @Override
    public boolean isCharging() {
        return charging;
    }

    @Override
    public void enableAutopilot() {
        autopilotEnabled = true;
        System.out.println("Autopilot enabled.");
    }

    @Override
    public void disableAutopilot() {
        autopilotEnabled = false;
        System.out.println("Autopilot disabled.");
    }

    @Override
    public boolean isAutopilotEnabled() {
        return autopilotEnabled;
    }

    // Each method should include appropriate print statements
}
