import java.util.ArrayList;

public class CarLot {

    private ArrayList<Car> carArrayListM;

    public CarLot(ArrayList<Car> carArrayList) {
        carArrayListM = carArrayList;
    }


    public void listall() { //

        for (int i = 0; i < carArrayListM.size(); i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(carArrayListM.get(i));
        }
    }

    public void addCar() { //

        carArrayListM.add(addCar);
}
    public void deleteCar(int selection) {

        carArrayListM.remove(selection);
    }

    public void infoCar() { //

        for (int i = 0; i < carArrayListM.size(); i++) {
            System.out.print(i + ". ");
            System.out.print(carArrayListM.get(i));
        }
    }

    public void carSwap() { //

        for (int i = 0; i < carArrayListM.size(); i++) {
            System.out.print(i + ". ");
            System.out.print(carArrayListM.get(i));
        }
    }

}
