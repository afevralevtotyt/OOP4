package sponsor;

import transport.Car;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Sponsor {
    private String name;
    private int supportSumm;
    public Set<Car> sponsoredCars;

    public Sponsor(String name, int supportSumm) {
        this.name = name;
        this.supportSumm = supportSumm;
        this.sponsoredCars =new HashSet<>();
    }

    public void addSponsoredCar(Car car){
        sponsoredCars.add(car);
        car.addSponsor(this);
    }

    public String getName() {
        return name;
    }

    public int getSupportSumm() {
        return supportSumm;
    }

    public Set<Car> getSponsoredCars() {
        return sponsoredCars;
    }

    public void sponsorLap(Set<Car> list){
        System.out.println("Заезд автомобилей: ");
        list.forEach(System.out::println);
        System.out.println("проспонсирован "+this.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
