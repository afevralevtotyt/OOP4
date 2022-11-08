package driver;

import transport.Bus;

public class BusDriver extends Driver<Bus> {
    private String driversCategory ="D";
    public BusDriver(String fullName, boolean driversPermit, int experience, Bus car, String driversCategory) {
        super(fullName, driversPermit, experience, driversCategory, car);
    }
    public void startMovement(Bus car) {
        car.start();
    }

    public void stopMovement(Bus car) {
        car.finish();
    }

    public void refuel(Bus car) {
        car.pitStop();
    }

    public Bus getCar() {
        return super.getCar();
    }

    public String getDriversCategory() {
        return driversCategory;
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

