import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 🔹 Original Bogie List (same as UC7)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury Coach", 80));

        // 🔹 Stream Filtering (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 🔹 Display filtered bogies
        System.out.println("Bogies with capacity > 60:");
        for (Bogie b : filteredBogies) {
            b.display();
        }
    }
}