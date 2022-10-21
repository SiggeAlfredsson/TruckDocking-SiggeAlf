import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            do {
                Menu.printAlternativs();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        Vehicle.printVehicle();
                        break;
                    case 2:
                        Menu.registerNewVehicle();
                        break;
                    case 3: // Denna case gör ingenting, kan likagärna ta bort. choice är redan 3 i detta fall. Endast för att förtydliga.
                        choice = 3;
                        break;
                }

            }while (choice!=3);

        }


    }


