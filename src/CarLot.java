import java.util.ArrayList;

public class CarLot {
    int selection;
    private ArrayList<Car> carArrayListM;

    public CarLot(ArrayList<Car> carArrayList) {
        carArrayListM = carArrayList;
    }


    public void listall() {

        for (int i = 0; i < carArrayListM.size(); i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(carArrayListM.get(i));
        }
    }

    public void addCar(Car addCar) {

        carArrayListM.add(addCar);
    }

    public void deleteCar(selection) {

        carArrayListM.remove(selection);
    }

    public void infoCar() {

        System.out.print(carArrayListM.get(selection));
    }

    public void carSwap() {

        carArrayListM.remove(selection);
        carArrayListM.add(selection, swap);
    }

}
