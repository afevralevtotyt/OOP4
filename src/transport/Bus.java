package transport;

public class Bus extends Car implements Competing{


    public enum CapacityType {
        ESPECIALLY_SMALL("<10 мест"),
        SMALL("<25 мест"),
        AVERAGE("40-50 мест"),
        BIG("60-80 мест"),
        ESPECIALLY_BIG("100-120 мест");
    private String capacity;

        CapacityType(String capacity) {
            this.capacity = capacity;
        }

        public static void determineCarType (Bus car){
            if (car.capacityType!=null){
                System.out.println(car.capacityType.capacity);}
            else {
                System.out.println("Недостаточно данных по авто");
            }
        }
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    private CapacityType capacityType;
    public Bus(String brand, String model, double engine_volume, CapacityType capacityType) {
        super(brand, model, engine_volume);
        this.capacityType = capacityType;
    }
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
