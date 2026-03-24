import java.util.LinkedList;

public class UC4_TrainConsistLinkedList {

    public static void main(String[] args) {

        System.out.println("=== UC4: Train Consist using LinkedList ===");

        // Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2 (index 1)
        train.add(1, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // Final output
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}