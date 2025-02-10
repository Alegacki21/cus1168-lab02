package academy.javapro;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a new Tesla Model S, 2024
        // TODO: Add your code here

        Tesla tesla = new Tesla("Model S", 2024);

        // Step 2: Display initial status
        System.out.println();
        System.out.println("Initial Status:");
        // TODO: Display car's initial state

        System.out.println(tesla.getMake() + " " + tesla.getModel() + " " + tesla.getYear());
        System.out.println("Running: " + tesla.isRunning);
        System.out.println("Autopilot: " + (tesla.isAutopilotEnabled() ? "true" : "false"));
        System.out.println("Charging: " + (tesla.isCharging() ? "true" : "false"));

        // Step 3: Start the car and test basic vehicle functions
        System.out.println("\nTesting basic vehicle functions:");
        tesla.startEngine();
        tesla.accelerate();
        tesla.brake();

        // Step 4: Test autonomous features
        System.out.println("\nTesting autonomous features:");
        tesla.enableAutopilot();
        System.out.println("Autopilot is currently: " + (tesla.isAutopilotEnabled() ? "enabled" : "disabled"));
        tesla.disableAutopilot();

        // Step 5: Test electric features
        System.out.println("\nTesting electric features:");
        tesla.charge();
        System.out.println("Charging status: " + (tesla.isCharging() ? "true" : "false"));

        // Step 6: Stop the car and display final status
        System.out.println("\nFinal car status:");
        tesla.stopEngine();
        System.out.println("Running: " + tesla.isRunning);
        System.out.println("Autopilot: " + (tesla.isAutopilotEnabled() ? "true" : "false"));
        System.out.println("Charging: " + (tesla.isCharging() ? "true" : "false"));
        System.out.println();
    }
}
