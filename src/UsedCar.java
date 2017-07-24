/**
 * Created by marcking2 on 7/24/17.
 */
public class UsedCar extends Car {


    //    private String makeM;
//    private String modelM;
//    private int  yearM;
//    private double priceM;
    private double mileageM;


    public UsedCar(String make, String model, int year, double price, double mileage) {
        super (make, model, year, price);
        mileageM = mileage;
    }

    public double getMileage() {
        return mileageM;
    }

    public void setMileage(double mileage) {
        mileageM = mileage;
    }

    public String toString() {

        String result = "";

        System.out.printf("%-12s%-12s%-12d$%,-17.2f%,-18.1f", super.toString(), mileageM);

        return result;
    }

}
