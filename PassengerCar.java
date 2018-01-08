package RentCar;

/**
 * author fuqiangwang
 * date
 */
public class PassengerCar extends Car {
    private double pcount;
    public PassengerCar(double price, double pcount){
        super(price);
        this.pcount = pcount;
    }

    public double getPcount() {
        return pcount;
    }

    public void setPcount(double pcount) {
        this.pcount = pcount;
    }
}
