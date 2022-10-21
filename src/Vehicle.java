import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private static List<Vehicle> vehicles = new ArrayList<>();
    private int weight;
    private String type;
    private char dockingStation;


    public Vehicle(String type, int weight, char dockingStation) {
        this.weight = weight;
        this.type = type;
        this.dockingStation = dockingStation;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public char getDockingStation() {
        return dockingStation;
    }

    public static void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public static void printVehicle() {

        if (vehicles.size() == 0) {
            System.out.println("Alla stationer är lediga.\n");
        } else {

            for (Vehicle vehicle : vehicles) {
                System.out.println("Fordonstyp: " + vehicle.getType() + "\nVikt: " + vehicle.getWeight() + "kg" + "\nAvlastningsstation: " + vehicle.getDockingStation());
                System.out.println("---------");
            }
        }
    }
}
