import java.util.ArrayList;

public class AutomobileInventory {

    static class Automobile {
        String make, model, color;
        int year;
        double price;

        public Automobile(String make, String model, String color, int year, double price) {
            this.make = make; this.model = model; this.color = color;
            this.year = year; this.price = price;
        }

        public void display() {
            System.out.println("Make: " + make + ", Model: " + model + ", Color: " + color +
                               ", Year: " + year + ", Price: $" + price);
        }
    }

    static ArrayList<Automobile> inventory = new ArrayList<>();

    public static void addVehicle(String make, String model, String color, int year, double price) {
        Automobile car = new Automobile(make, model, color, year, price);
        inventory.add(car);
        System.out.println("Vehicle added successfully.");
    }

    public static boolean updateVehicle(String make, String model, int year, String newColor, double newPrice) {
        for (Automobile car : inventory) {
            if (car.make.equalsIgnoreCase(make) && car.model.equalsIgnoreCase(model) && car.year == year) {
                car.color = newColor; car.price = newPrice;
                System.out.println("Vehicle updated successfully.");
                return true;
            }
        }
        System.out.println("Vehicle not found.");
        return false;
    }

    public static boolean removeVehicle(String make, String model, String color, int year) {
        for (int i = 0; i < inventory.size(); i++) {
            Automobile car = inventory.get(i);
            if (car.make.equalsIgnoreCase(make) && car.model.equalsIgnoreCase(model) && 
                car.color.equalsIgnoreCase(color) && car.year == year) {
                inventory.remove(i);
                System.out.println("Vehicle removed successfully.");
                return true;
            }
        }
        System.out.println("Vehicle not found.");
        return false;
    }

    public static void listInventory() {
        if (inventory.isEmpty()) {
            System.out.println("No vehicles in inventory.");
        } else {
            System.out.println("Inventory List:");
            for (Automobile car : inventory) {
                car.display();
            }
        }
    }

    public static void main(String[] args) {
        addVehicle("Toyota", "Camry", "Red", 2020, 22000.00);
        addVehicle("Honda", "Civic", "Blue", 2019, 19500.00);
        listInventory();
        updateVehicle("Honda", "Civic", 2019, "Black", 18900.00);
        removeVehicle("Toyota", "Camry", "Red", 2020);
        listInventory();
    }
}

