package mechanic;

import transport.Bus;
import transport.Car;

import java.util.*;

public class Mechanic {

    private String name;
    private String company;
    private String categories;
    public Set<Car> cars;

    public Mechanic(String name, String company, String categories) {
        this.name = name;
        this.company = company;
        this.categories = categories;
        this.cars = new HashSet<>();


    }

    public void addCar(Car car) {
        if (this.categories.contains(car.getCATEGORY())) {
            cars.add(car);
            car.addMechanic(this);
        } else {
            throw new RuntimeException("Данный автомобиль не соответствует квалификации механика");
        }
    }

    public String getName() {
        return name;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public void service(Car car) {
        if (cars.contains(car)) {
            System.out.println("Автомобиль " + car + " технически обслужен");
        } else {
            System.out.println("Это чужой автомобиль");
        }
    }


    public void repair(Car car) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;

        Mechanic mechanic = (Mechanic) o;

        if (!Objects.equals(name, mechanic.name)) return false;
        if (!Objects.equals(company, mechanic.company)) return false;
        return Objects.equals(categories, mechanic.categories);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (categories != null ? categories.hashCode() : 0);
        return result;
    }
}
