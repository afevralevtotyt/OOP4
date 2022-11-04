package transport;

public class Truck extends Car implements Competing{
    public enum LoadCapacity{
        N1("<3,5 тонн"),
        N2("3,5-12 тонн"),
        N3(">12 тонн");

        public static void determineCarType (Truck car){
            if (car.loadCapacity!=null){
                System.out.println(car.loadCapacity.capacity);}
            else {
                System.out.println("Недостаточно данных по авто");
            }
        }
        private String capacity;

        LoadCapacity(String capacity) {
            this.capacity = capacity;
        }
    }
    private LoadCapacity loadCapacity;
    public Truck(String brand, String model, double engine_volume, LoadCapacity loadCapacity) {
        super(brand, model, engine_volume);
        this.loadCapacity = loadCapacity;
    }

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

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }
}
