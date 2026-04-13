import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 🔹 Array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // 🔹 Sorting using built-in method
        Arrays.sort(bogieNames);

        // 🔹 Display sorted result
        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));
    }
}