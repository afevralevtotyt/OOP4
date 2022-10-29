package transport;
import utilits.Utilits;
public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;

    public Car(String brand, String model, double engine_volume) {
        this.brand = Utilits.checkValidStringOrDefault(brand, "TOYOTA");
        this.model = Utilits.checkValidStringOrDefault(model, "default");
        engineVolume = Math.max(engine_volume, 0);
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

    @Override
    public String toString() {
        return "Автомобиль класса: " +
                this.getClass()+
                ", марки: " + brand +
                ", модель: " + model +
                ", объем двигателя " + engineVolume;
    }
}
