package transport;

public class Truck extends Car implements Competing{

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
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля 150 км/ч");

    }

}
