import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;   // Cylindrical / Open / Box
    String cargo;  // Petroleum / Coal / Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public void display() {
        System.out.println(type + " - Cargo: " + cargo);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 🔹 Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // 🔹 Safety validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // 🔹 Display result
        if (isSafe) {
            System.out.println("Train is SAFE and compliant ✅");
        } else {
            System.out.println("Train is UNSAFE ❌");
        }
    }
}