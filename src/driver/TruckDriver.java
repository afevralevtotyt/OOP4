package driver;

import transport.Car;
import transport.Truck;

public class TruckDriver extends Driver<Truck>  {


    private String driversCategory ="C";


    public TruckDriver(String fullName, boolean driversPermit, int experience, Truck car, String driversCategory) {
        super(fullName, driversPermit, experience,driversCategory, car);


    }

    public void startMovement(Truck car) {
        this.start();
    }

    public void stopMovement(Truck car) {
        this.finish();
    }

    public void refuel(Truck car) {
        this.refuel();
    }

    public String getDriversCategory() {
        return driversCategory;
    }

    public Truck getCar() {
        return super.getCar();
    }


    @Override
    public String toString() {
        return "Водитель " + this.getFullName() +
                " управляет автомобилем "+ getCar() + " и будет участвовать в заезде ";
    }
}
