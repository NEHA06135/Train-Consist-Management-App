import java.util.HashMap;
import java.util.Map;

public class UC6_BogieCapacityMap {

    public static void main(String[] args) {

        System.out.println("=== UC6: Bogie Capacity Mapping using HashMap ===");

        // Create HashMap (Bogie -> Capacity)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogies with capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);

        // Display all bogie capacities
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}