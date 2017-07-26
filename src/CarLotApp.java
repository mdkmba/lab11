import java.util.*;

/**
 * Created by marcking2 on 7/24/17.
 */
public class CarLotApp {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int selection = 0;

        ArrayList<Car> carArrayList;
        carArrayList = new ArrayList<>();

        carArrayList.add(new UsedCar("BMW", "328i", 2011, 11000, 109000));
        carArrayList.add(new Car("Ford", "Fusion", 2017, 28000));
        carArrayList.add(new UsedCar("GM", "Corvette", 2015, 30000, 78000));
        carArrayList.add(new Car("Lexus", "GX 460", 2017, 66000));
        carArrayList.add(new UsedCar("Mercedes", "CL500", 2001, 18000, 160000));
        carArrayList.add(new Car("Ford", "Mustang", 2017, 35000));
        carArrayList.add(new UsedCar("BMW", "740", 2010, 19000, 152000));
        carArrayList.add(new UsedCar("Ford", "Pinto", 1974, 2.63, 732.9));



        System.out.print("\n\n\nWelcome to King Cisero New & Used Cars!");


        do{
        System.out.println("\nCurrent Inventory:");
        System.out.printf("\n%-2s %-12s%-12s%-12s%-18s%-18s\n", "#", "Make", "Model", "Year", "Price", "Mileage(Used Cars)");
        System.out.printf("%-2s %-12s%-12s%-12s%-18s%-18s\n", "==", "==========", "==========", "==========", "==============", "==================");

        CarLot carList = new CarLot(carArrayList);
            carList.listall();
            carList.addCar();
            carList.deleteCar();
            carList.infoCar();
            carList.carSwap();

            public void infoCar() {
            System.out.print("\nWhich car would you like:  ");
            selection = (scnr.nextInt() - 1);

        }
        public void addcar() {
            for (int i = 0; i < n; i++) {
                carList.add(new Car());
                System.out.print("\nEnter Make: ");
                carArrayList.get(i).setMakeM(scnr.nextLine());
                System.out.print("\nEnter Model: ");
                carArrayList.get(i).setModelM(scnr.nextLine());
                System.out.print("\nEnter Year: ");
                carArrayList.get(i).setYearM(scnr.nextInt());
                System.out.print("\nEnter Price: ");
                carArrayList.get(i).setPriceM(scnr.nextDouble());
                scnr.nextLine();
            }

        }
            }




        }



    }


