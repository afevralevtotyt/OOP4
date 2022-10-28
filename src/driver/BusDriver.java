package driver;

import transport.Bus;
import transport.Competing;

public class BusDriver <T extends Bus & Competing> extends Driver {
    private final String DRIVERS_CATEGORY="D";
    private Bus car;
    public BusDriver(String fullName, boolean driversPermit, int experience, T car) {
        super(fullName, driversPermit, experience);
        this.car = car;
    }

    public void startMovement(T car) {
        car.start();
    }

    public void stopMovement(T car) {
        car.finish();
    }

    public void refuel(T car) {
        car.pitStop();
    }

    public Bus getCar() {
        return car;
    }

    public String getDRIVERS_CATEGORY() {
        return DRIVERS_CATEGORY;
    }

    public void setCar(Bus car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Водитель " + this.getFULL_NAME() +
                " управляет автомобилем "+ getCar() + " и будет участвовать в заезде ";
    }

}

