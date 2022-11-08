package transport;

import driver.Driver;
import mechanic.Mechanic;
import sponsor.Sponsor;

import java.util.LinkedList;
import java.util.List;

public class PassengerCar extends Car implements Competing {

    String CATEGORY="B";

    private BodyType bodyType;

    private Driver driver;

    private List<Sponsor> sponsorList;
    public PassengerCar(String brand, String model, double engine_volume, BodyType bodyType) {
        super(brand, model, engine_volume);
        this.bodyType = bodyType;
        this.driver = driver;
        this.sponsorList = new LinkedList<>();
    }


    public PassengerCar(String brand, String model, double engine_volume) {
        super(brand, model, engine_volume);
    }

    @Override
    public void start() {
        System.out.println("Fast start");
    }

    @Override
    public void finish() {
        System.out.println("Fast finish");
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль на Питстопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга легкового автомобиля 3 минуты");

    }

    @Override
    public int maxSpeed() {
        System.out.println("Максимальная скорость лекгового автомобиля 200 км/ч");
return 200;
    }

    @Override
    public String getCATEGORY() {
        return CATEGORY;
    }

    @Override
    public boolean getDiagnosed() {
        System.out.println("Легковой автомобиль "+ this.getModel() +" на диагностике");
        if(super.getDiagnosed() == true){
            return true;}else{ try {
            throw new RuntimeException("Автомобиль не прошел диагностику");}
        catch (RuntimeException e){
            System.out.println(e.getMessage()); return false;
        }}
    }
    public String getBodyType() {
        if (bodyType != null) {
            return bodyType.getBodyTypeRu();
        } else {
            return "Недостаточно данных";
        }}


}
