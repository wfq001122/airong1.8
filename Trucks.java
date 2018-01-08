package RentCar;

/**
 * author fuqiangwang
 * date
 */
public class Trucks extends Car {
    private double load;

    public double getLoad() {
        return load;
    }

    public Trucks(double price,double load) {
        super(price);
        this.load = load;
    }

}
