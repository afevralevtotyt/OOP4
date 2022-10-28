package transport;
import utilits.Utilits;
public class Car {
    private final String BRAND;
    private final String MODEL;
    private final double ENGINE_VOLUME;

    public Car(String brand, String model, double engine_volume) {
        BRAND = Utilits.checkValidStringOrDefault(brand, "TOYOTA");
        MODEL = Utilits.checkValidStringOrDefault(model, "default");
        ENGINE_VOLUME = Math.max(engine_volume, 0);
    }

    public String getBRAND() {
        return BRAND;
    }

    public String getMODEL() {
        return MODEL;
    }

    public double getENGINE_VOLUME() {
        return ENGINE_VOLUME;
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
                ", марки: " + BRAND +
                ", модель: " + MODEL +
                ", объем двигателя " + ENGINE_VOLUME;
    }
}
