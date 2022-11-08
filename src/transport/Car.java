package transport;
import driver.Driver;
import mechanic.Mechanic;
import sponsor.Sponsor;
import utilits.Utilits;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class Car {

    private String CATEGORY;
    private final String brand;
    private final String model;
    private final double engineVolume;
    private Driver driver;
    private List<Sponsor> sponsorList;
    public List<Mechanic> mechanic;

    public Car(String brand, String model, double engine_volume) {
        this.brand = Utilits.checkValidStringOrDefault(brand, "TOYOTA");
        this.model = Utilits.checkValidStringOrDefault(model, "default");
        engineVolume = Math.max(engine_volume, 0);
        this.sponsorList = new LinkedList<>();
        this.mechanic = new LinkedList<>();
    }

    public void addMechanic(Mechanic mechanic){
        this.mechanic.add(mechanic);
        mechanic.cars.add(this);
    }
    public void addSponsor(Sponsor sponsor) {
        sponsorList.add(sponsor);
        sponsor.sponsoredCars.add(this);
    }


    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void start(){
        System.out.println("Started");
    }
    public void finish(){
        System.out.println("Finished");
    }

    public void refuel(){
        System.out.println("Автомобиль " + this.getModel() + " на заправке");
    }

    public Driver getDriver() {
        if (driver!=null){
        return driver;}
        else{
            return null;
        }
    }

    public String getCATEGORY() {
        return CATEGORY;
    }

    public List<Mechanic> getMechanic() {
        return mechanic;
    }

    public List<Sponsor> getSponsorList() {
        return sponsorList;
    }

    @Override
    public String toString() {
        return "Автомобиль класса: " +
                this.getClass()+
                ", марки: " + brand +
                ", модель: " + model +
                ", объем двигателя " + engineVolume;
    }
  public boolean getDiagnosed(){
        if(!brand.isEmpty()&&brand!=null&&!brand.isBlank()&&!model.isEmpty()&&model!=null&&!model.isBlank()&&engineVolume!=0){
         return true;
      } else {
            return false;
        }
  }

}
