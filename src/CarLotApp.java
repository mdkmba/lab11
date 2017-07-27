import java.io.PrintStream;
import java.util.*;

class CarLotApp {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int selection = 0;
        boolean loop = true;
        CarLot x = new CarLot();
//

        int userSelect = 0;


        System.out.print("\n\n\nWelcome to King Cisero New & Used Cars!\n");


        do {
            System.out.println("\nCurrent Inventory:");
            System.out.printf("\n%-2s %-12s%-12s%-12s%-18s%-18s\n", "#", "Make", "Model", "Year", "Price", "Mileage(Used Cars)");
            System.out.printf("%-2s %-12s%-12s%-12s%-18s%-18s\n", "==", "==========", "==========", "==========", "==============", "==================");
            System.out.println();
            x.listall();
            System.out.println("\n1. List of available inventory.\n2. Add a car to inventory." +
                    "\n3. Remove a car from inventory.\n4. Select a car to review.\n5. Replace a car in inventory.\n\n");
            System.out.print("Please make a selection: ");
            userSelect = scnr.nextInt();

            switch (userSelect) {
                case 1:
                    x.listall();
//                case 2:
//                    x.addCar();
                case 3:
                    x.deleteCar();
                case 4:
                    x.infoCar();
                case 5:
                    x.deleteCar();
                case 6:
                    loop = false;

                default:
                    userSelect = 1;
            }

        } while (loop);


    }
}