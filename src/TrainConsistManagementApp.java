import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 🔹 Bogie IDs (can be unsorted initially)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // 🔹 Sort first (IMPORTANT for Binary Search)
        Arrays.sort(bogieIds);

        // 🔹 Input search key
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // 🔹 Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;   // search right
            } else {
                high = mid - 1;  // search left
            }
        }

        // 🔹 Output
        if (found) {
            System.out.println("Bogie ID found ✅");
        } else {
            System.out.println("Bogie ID not found ❌");
        }

        sc.close();
    }
}