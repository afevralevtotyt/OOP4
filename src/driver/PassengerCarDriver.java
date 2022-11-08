package driver;

import transport.PassengerCar;

public class PassengerCarDriver extends Driver<PassengerCar> {

    public PassengerCarDriver(String fullName, boolean driversPermit, int experience, PassengerCar car, String driversCategory) {
        super(fullName, driversPermit, experience, driversCategory, car);
        car.setDriver(this);

    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void finish() {
        super.finish();
    }

    public PassengerCar getCar() {
        return getCar();
    }






    @Override
    public String toString() {
        return "Водитель " + this.getFullName() +
                " управляет автомобилем "+ getCar() + " и будет участвовать в заезде ";
    }

}
