import java.util.LinkedHashSet;
import java.util.Set;

public class UC5_LinkedHashSetTrainFormation {

    public static void main(String[] args) {

        System.out.println("=== UC5: Train Formation using LinkedHashSet ===");

        // Create LinkedHashSet
        Set<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper"); // duplicate (will be ignored)

        // Display final formation
        System.out.println("\nFinal Train Formation (No duplicates, insertion order maintained):");
        System.out.println(train);
    }
}