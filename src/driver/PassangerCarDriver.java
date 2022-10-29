package driver;

import transport.Competing;
import transport.PassangerCar;

public class PassangerCarDriver <T extends PassangerCar & Competing> extends Driver {
    private String DRIVERS_CATEGORY="B";

    private PassangerCar car;

    public PassangerCarDriver(String fullName, boolean driversPermit, int experience, T car) {
        super(fullName, driversPermit, experience);
        this.car = car;
    }

    public void startMovement(T car) {
        this.car.start();
    }

    public void stopMovement(T car) {
        this.car.finish();
    }

    public PassangerCar getCar() {
        return car;
    }

    public void refuel(T car) {
        this.car.pitStop();
    }

    public String getDRIVERS_CATEGORY() {
        return DRIVERS_CATEGORY;
    }

    @Override
    public String toString() {
        return "Водитель " + this.getFullName() +
                " управляет автомобилем "+ getCar() + " и будет участвовать в заезде ";
    }

}
