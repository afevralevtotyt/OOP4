package driver;

import transport.Truck;

public class TruckDriver<T extends Truck> extends Driver  {


    private String driversCategory ="C";

    private T car;
    public TruckDriver(String fullName, boolean driversPermit, int experience, T car, String driversCategory) {
        super(fullName, driversPermit, experience,driversCategory);
        this.car = car;

    }

    public void startMovement(T car) {
        this.car.start();
    }

    public void stopMovement(T car) {
        this.car.finish();
    }

    public void refuel(T car) {
        this.car.pitStop();
    }

    public String getDriversCategory() {
        return driversCategory;
    }

    public T getCar() {
        return car;
    }


    @Override
    public String toString() {
        return "Водитель " + this.getFullName() +
                " управляет автомобилем "+ getCar() + " и будет участвовать в заезде ";
    }
}
