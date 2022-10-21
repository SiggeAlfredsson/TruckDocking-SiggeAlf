import java.util.Scanner;

public class Menu {



    public static void registerNewVehicle(){
        printVehicleTypes();
        chooseVehicleType();
    }

    public static void printVehicleTypes() {

        System.out.println
                ("""
                        Typ av lastbil:
                        1. Skåpbil
                        2. Lätt lastbil
                        3. Tung lastbil
                        """);

    }

    public static void chooseVehicleType() {
        int type;
        Scanner scanner = new Scanner(System.in);
        type = scanner.nextInt();
        int maxWeightStationA = 5000;
        int maxWeightStationD = 9000;
        switch (type) {

            case 1:
                //van

                System.out.println("Ange vikten på din skåpbil:");
                int weight = scanner.nextInt();
                if (weight>maxWeightStationA) {
                    System.out.println("Error, för hög vikt.\n");
                } else if (DockingStations.station[0]==0){
                    Vehicle van = new Van(weight, 'A');
                    Vehicle.addVehicle(van);
                    DockingStations.station[0]=1;
                    System.out.println("Skåpbil registrerad för station A\n");
                } else if(DockingStations.station[1]==0){
                    Vehicle van = new Van(weight, 'B');
                    Vehicle.addVehicle(van);
                    DockingStations.station[1]=1;
                    System.out.println("Skåpbil registrerad för station B\n");
                } else {
                    System.out.println("Sorry, ingen ledig plats för dig :/\n");
                }

                break;
            case 2:
                //smalltruck
                System.out.println("Ange vikten på din lätta lastbil:");
                weight = scanner.nextInt();
                if (DockingStations.station[2]==0) {
                    Vehicle smallTruck = new SmallTruck(weight, 'C');
                    Vehicle.addVehicle(smallTruck);
                    DockingStations.station[2]=1;
                    System.out.println("Lätt lastbil registrerad för station C\n");
                } else if (DockingStations.station[3]==0) {
                    Vehicle smallTruck = new SmallTruck(weight, 'D');
                    Vehicle.addVehicle(smallTruck);
                    DockingStations.station[3] = 1;
                    System.out.println("Lätt lastbil registrerad för station D\n");
                } else if ((weight<maxWeightStationA) && (DockingStations.station[0]==0)) {
                    Vehicle smallTruck = new SmallTruck(weight, 'A');
                    Vehicle.addVehicle(smallTruck);
                    DockingStations.station[0] = 1;
                    System.out.println("Lätt lastbil registrerad för station A\n");
                } else {
                    System.out.println("Sorry, ingen ledig plats för dig :/\n");
                }
                break;
            case 3:
                //heavytruck
                System.out.println("Ange vikten på din tunga lastbil:");
                weight = scanner.nextInt();
                if (DockingStations.station[4]==0) {
                    Vehicle heavyTruck = new HeavyTruck(weight, 'E');
                    Vehicle.addVehicle(heavyTruck);
                    DockingStations.station[4]=1;
                    System.out.println("Tung lastbil registrerad för station E\n");
                } else if ((weight<maxWeightStationD) && (DockingStations.station[3]==0)) {
                    Vehicle heavyTruck = new HeavyTruck(weight, 'D');
                    Vehicle.addVehicle(heavyTruck);
                    DockingStations.station[3] = 1;
                    System.out.println("Lätt lastbil registrerad för station D\n");
                } else {
                    System.out.println("Sorry, ingen ledig plats för dig :/\n");
                }
                break;

        }

    }

    public static void printAlternativs() {
        System.out.println("""
                – Avlastningsstationen dumpa mera –\s
                1. Se parkerade lastbilar
                2. Registrera ny avlastande lastbil
                3. Avsluta
                """);
    }


}
