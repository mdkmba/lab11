import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by marcking2 on 7/24/17.
 */
public class CarLot {

    private ArrayList<Car> carArrayList;

    public CarLot(String makeM, String modelM, int yearM, double priceM, double mileageM) {
        carArrayList = new ArrayList<>();

        //list of cars to work from in the ArrayList
        carArrayList.add(new UsedCar("BMW", "328i", 2011, 11000, 109000));
        carArrayList.add(new Car("Ford", "Fusion", 2017, 28000));
        carArrayList.add(new UsedCar("GM", "Corvette", 2015, 30000, 78000));
        carArrayList.add(new Car("Lexus", "GX 460", 2017, 66000));
        carArrayList.add(new UsedCar("Mercedes", "CL500", 2001, 18000, 160000));
        carArrayList.add(new Car("Ford", "Mustang", 2017, 35000));
        carArrayList.add(new UsedCar("BMW", "740", 2010, 19000, 152000));
        carArrayList.add(new UsedCar("Ford", "Pinto", 1974, 2.63, 732.9));


    }

    public CarLot() {
        
    }

    public ArrayList<Car> listall() {

        return carArrayList;
    }
}