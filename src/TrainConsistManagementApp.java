// 🔹 Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// 🔹 Goods Bogie Class
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    // 🔹 Method to assign cargo safely
    public void assignCargo(String cargo) {

        try {
            // ❌ Unsafe condition
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Rectangular bogie cannot carry Petroleum");
            }

            // ✅ Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }
}

// 🔹 Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 🔹 Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // 🔹 Safe case
        b1.assignCargo("Petroleum");

        // 🔹 Unsafe case
        b2.assignCargo("Petroleum");

        // 🔹 Program continues
        System.out.println("Program continues safely...");
    }
}