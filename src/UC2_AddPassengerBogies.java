import java.util.ArrayList;
import java.util.List;

public class UC2_AddPassengerBogies {

    public static void main(String[] args) {

        System.out.println("=== UC2: Add Passenger Bogies ===");

        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("\nAfter Adding Bogies:");
        System.out.println(passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter Removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        System.out.println("\nIs Sleeper present? " + passengerBogies.contains("Sleeper"));

        // Final state
        System.out.println("\nFinal Bogie List:");
        System.out.println(passengerBogies);
    }
}