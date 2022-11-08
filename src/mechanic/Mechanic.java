package mechanic;

import transport.Bus;
import transport.Car;

import java.util.LinkedList;
import java.util.List;

public class Mechanic<C extends Car> {

    private String name;
    private String company;
    private String categories;
    public List<Car> cars;

    public Mechanic(String name, String company, String categories) {
        this.name = name;
        this.company = company;
        this.categories = categories;
        this.cars = new LinkedList<>();
        

    }

    public void addCar(C car) {
        if (this.categories.contains(car.getCATEGORY()))
        {cars.add(car);
        car.addMechanic(this);
    }else{
        throw new RuntimeException("Данный автомобиль не соответствует квалификации механика");
    }}

    public String getName() {
        return name;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public void service(C car) {
        if (cars.contains(car)) {
            System.out.println("Автомобиль " + car + " технически обслужен");
        } else {
            System.out.println("Это чужой автомобиль");
        }
    }


    public void repair(C car) {
        if (cars.contains(car)) {
            System.out.println("Автомобиль " + car + " отремонтирован");
        } else {
            System.out.println("Это чужой автомобиль");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
