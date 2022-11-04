package driver;

import transport.Bus;

public class BusDriver <T extends Bus> extends Driver {
    private String driversCategory ="D";
    private T car;
    public BusDriver(String fullName, boolean driversPermit, int experience, T car, String driversCategory) {
        super(fullName, driversPermit, experience,driversCategory);
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

    public String getDriversCategory() {
        return driversCategory;
    }

    public void setCar(T car) {
        this.car = car;
    }

    public void setDriversCategory(String driversCategory) {
        try{
            if (!driversCategory.equals("D")){
                throw new IllegalArgumentException("Необходимо указать тип прав");
            } else {
                this.driversCategory = driversCategory;
            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());

        }
    }

    @Override
    public String toString() {
        return "Водитель " + this.getFullName() +
                " управляет автомобилем "+ getCar() + " и будет участвовать в заезде ";
    }

}

