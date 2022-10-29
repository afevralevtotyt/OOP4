package driver;

import transport.Competing;
import transport.Truck;

public class TruckDriver<T extends Truck & Competing> extends Driver  {
    private String DRIVERS_CATEGORY="C";

    private T car;

    public TruckDriver(String fullName, boolean driversPermit, int experience, T car) {
        super(fullName, driversPermit, experience);
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

    public String getDRIVERS_CATEGORY() {
        return DRIVERS_CATEGORY;
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
