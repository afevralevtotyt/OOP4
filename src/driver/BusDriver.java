package driver;

import transport.Bus;

public class BusDriver <T extends Bus> extends Driver {
    private final String DRIVERS_CATEGORY="D";
    private T car;
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

    public void setCar(T car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Водитель " + this.getFullName() +
                " управляет автомобилем "+ getCar() + " и будет участвовать в заезде ";
    }

}

