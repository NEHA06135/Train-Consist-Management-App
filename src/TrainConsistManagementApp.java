import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 🔹 Bogie IDs (try empty array to test exception)
        String[] bogieIds = {};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            // 🔹 Fail-fast check
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available for search!");
            }

            // 🔹 Linear Search (can also use Binary if sorted)
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(key)) {
                    found = true;
                    break;
                }
            }

            // 🔹 Result
            if (found) {
                System.out.println("Bogie ID found ✅");
            } else {
                System.out.println("Bogie ID not found ❌");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}