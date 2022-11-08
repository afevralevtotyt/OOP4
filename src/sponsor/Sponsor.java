package sponsor;

import transport.Car;

import java.util.LinkedList;
import java.util.List;

public class Sponsor {
    private String name;
    private int supportSumm;
    public List<Car> sponsoredCars;

    public Sponsor(String name, int supportSumm) {
        this.name = name;
        this.supportSumm = supportSumm;
        this.sponsoredCars =new LinkedList<>();
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

    public List<Car> getSponsoredCars() {
        return sponsoredCars;
    }

    public void sponsorLap(LinkedList<Car> list){
        System.out.println("Заезд автомобилей: ");
        list.forEach(System.out::println);
        System.out.println("проспонсирован "+this.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
