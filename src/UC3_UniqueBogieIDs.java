import java.util.HashSet;
import java.util.Set;

public class UC3_UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=== UC3: Track Unique Bogie IDs ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogies (with duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display final set
        System.out.println("\nBogie IDs after insertion:");
        System.out.println(bogieIDs);

        System.out.println("\nTotal unique bogies: " + bogieIDs.size());
    }
}