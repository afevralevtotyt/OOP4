package transport;

import java.util.SortedMap;

public class Truck extends Car implements Competing{
    private LoadCapacity loadCapacity;
    String CATEGORY = "C";

    @Override
    public String getCATEGORY() {
        return CATEGORY;
    }

    public Truck(String brand, String model, double engine_volume, LoadCapacity loadCapacity) {
        super(brand, model, engine_volume);
        this.loadCapacity = loadCapacity;
    }

    public String getCapacity(){
        if (loadCapacity!=null){
            return loadCapacity.getCapacity();}
        else {
            return "Недостаточно данных";
        }}
    public Truck(String brand, String model, double engine_volume) {
        super(brand, model, engine_volume);
    }
    @Override
    public void start() {
        System.out.println("The slowest start");
    }

    @Override
    public void finish() {
        System.out.println("The slowest finish");
    }
    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль на Питстопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузового автомобиля 5 минуты");

    }

    @Override
    public int maxSpeed() {
      return 150;

    }

    @Override
    public boolean getDiagnosed() {
        System.out.println("Грузовой автомобиль "+ this.getModel() +" на диагностике");
        if(super.getDiagnosed() == true){
            return true;}else{ try {
            throw new RuntimeException("Автомобиль не прошел диагностику");}
        catch (RuntimeException e){
            System.out.println(e.getMessage()); return false;
        }}
    }


}