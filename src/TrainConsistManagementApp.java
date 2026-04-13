import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 🔹 Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // 🔹 Input search key
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        boolean found = false;

        // 🔹 Linear Search
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                break; // stop when found
            }
        }

        // 🔹 Output result
        if (found) {
            System.out.println("Bogie ID found ✅");
        } else {
            System.out.println("Bogie ID not found ❌");
        }

        sc.close();
    }
}