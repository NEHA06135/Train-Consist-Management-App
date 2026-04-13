// 🔹 Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 🔹 Bogie Class
class Bogie {
    String name;
    int capacity;

    // Constructor with validation
    public Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

// 🔹 Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        try {
            // ✅ Valid bogie
            Bogie b1 = new Bogie("Sleeper", 72);
            b1.display();

            // ❌ Invalid bogie
            Bogie b2 = new Bogie("AC Chair", -10);
            b2.display(); // will not execute

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}