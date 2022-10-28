package transport;

public class PassangerCar extends Car implements Competing {
    public PassangerCar(String brand, String model, double engine_volume) {
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
    public void maxSpeed() {
        System.out.println("Максимальная скорость лекгового автомобиля 200 км/ч");

    }


}
