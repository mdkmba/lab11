import java.util.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class CarLot {

    int i = 0;

    Scanner scnr = new Scanner (System.in);
    public static ArrayList<Car> list = new ArrayList<Car>();

    {
        list.add(new UsedCar("BMW", "328i", 2011, 11000, 109000));
        list.add(new Car("Ford", "Fusion", 2017, 28000));
        list.add(new UsedCar("GM", "Corvette", 2015, 30000, 78000));
        list.add(new Car("Lexus", "GX 460", 2017, 66000));
        list.add(new UsedCar("Mercedes", "CL500", 2001, 18000, 160000));
        list.add(new Car("Ford", "Mustang", 2017, 35000));
        list.add(new UsedCar("BMW", "740", 2010, 19000, 152000));
        list.add(new UsedCar("Ford", "Pinto", 1974, 2.63, 732.9));
    }

    public static ArrayList<Car> getList() {
        return list;
    }

    public String listall() {
        int i = 0;
        for (i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(list.get(i));
        }
        return String.valueOf(i);
    }

    public void addCar(Car addCar) {

        list.add(addCar);
    }

    public void deleteCar() {

        list.remove(i);
    }

    public void infoCar() {

        System.out.print(list.get(i));
    }

    public void addcar () {
        list.add(new Car());
        System.out.print("\nEnter Make: ");
        list.get(i).setMakeM(scnr.nextLine());
        System.out.print("\nEnter Model: ");
        list.get(i).setModelM(scnr.nextLine());
        System.out.print("\nEnter Year: ");
        list.get(i).setYearM(scnr.nextInt());
        System.out.print("\nEnter Price: ");
        list.get(i).setPriceM(scnr.nextDouble());
        scnr.nextLine();
    }
}