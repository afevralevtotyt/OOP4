package driver;

import transport.PassangerCar;

public class PassangerCarDriver <T extends PassangerCar> extends Driver {

    private T car;

    public PassangerCarDriver(String fullName, boolean driversPermit, int experience, T car, String driversCategory) {
        super(fullName, driversPermit, experience, driversCategory);
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





    @Override
    public String toString() {
        return "Водитель " + this.getFullName() +
                " управляет автомобилем "+ getCar() + " и будет участвовать в заезде ";
    }

}
