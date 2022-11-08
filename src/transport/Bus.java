package transport;

public class Bus extends Car implements Competing{



    String CATEGORY = "D";


    private CapacityType capacityType;
    public Bus(String brand, String model, double engine_volume, CapacityType capacityType) {
        super(brand, model, engine_volume);
        this.capacityType = capacityType;
    }
    public Bus(String brand, String model, double engine_volume) {
        super(brand, model, engine_volume);
    }
    public CapacityType getCapacityType() {
        return capacityType;
    }
    public String getCapacity(){
        if (capacityType!=null){
            return capacityType.getCapacity();}
        else {
            return "Недостаточно данных";
        }

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
        System.out.println("Лучшее времмя круга " +(10/this.maxSpeed()));
    }

    @Override
    public boolean getDiagnosed() {
        System.out.println("Автобус "+ getModel() +" в диагностике не нуждается");
        return true;

    }
    @Override
    public int maxSpeed() {
        System.out.println("Максимальная скорость автобуса 140 км/ч");
        return 140;

    }

    @Override
    public String getCATEGORY() {
        return CATEGORY;
    }
}
