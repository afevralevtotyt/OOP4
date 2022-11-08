package driver;

import transport.Car;
import utilits.Utilits;


public abstract class Driver<T extends Car> {

    private final String fullName;
    private boolean driversPermit;
    private int experience;
    private String driversCategory;
    private final T car;


    public Driver(String fullName, boolean driversPermit, int experience, String driversCategory, T car) {
        this.fullName = Utilits.checkValidStringOrDefault(fullName, "Безымянный водитель");
        this.experience = Math.max(0, experience);
        setDriversPermit(driversPermit);
        setDriversCategory(driversCategory);
        if (car.getDriver() == null) {
            car.setDriver(this);
            this.car=car;
        } else {
            throw new RuntimeException("У данного авто уже есть водитель");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isDriversPermit() {
        return driversPermit;
    }


    public void setDriversPermit(boolean droversPermit) {
        this.driversPermit = droversPermit;
    }

    public int getExperience() {
        return experience;
    }

    public void start(){
        this.car.start();
    }
    public void finish(){
        this.car.finish();
    }

    public void setDriversCategory(String driversCategory) {
            if (driversCategory.equals("B")||driversCategory.equals("C")||driversCategory.equals("D")){
                this.driversCategory = driversCategory;
            } else {
                throw new IllegalArgumentException("Необходимо указать тип прав");
            }
    }

    public String getDriversCategory() {
        return driversCategory;
    }
    public void refuel() {
        this.car.refuel();
    }

    public T getCar() {
        return car;
    }
}
