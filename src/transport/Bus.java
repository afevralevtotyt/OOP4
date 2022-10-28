package transport;

public class Bus extends Car implements Competing{
    public Bus(String brand, String model, double engine_volume) {
        super(brand, model, engine_volume);
    }

    @Override
    public void start() {
        System.out.println("Slow start");;
    }

    @Override
    public void finish() {
        System.out.println("Slow finish");    }

    @Override
    public void pitStop() {
        System.out.println("Автобус на Питстопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автобуса 5 минут");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса 140 км/ч");

    }
}
