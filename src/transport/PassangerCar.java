package transport;

public class PassangerCar extends Car implements Competing {

    public enum BodyType {SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        ESTATE_CAR("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String bodyTypeRu;
        public static void determineCarType (PassangerCar car){
            if (car.bodyType!=null){
                System.out.println(car.bodyType.bodyTypeRu);}
            else {
                System.out.println("Недостаточно данных по авто");
            }
        }
        BodyType(String bodyTypeRu) {
            this.bodyTypeRu = bodyTypeRu;
        }
    }

    private BodyType bodyType;
    public PassangerCar(String brand, String model, double engine_volume, BodyType bodyType) {
        super(brand, model, engine_volume);
        this.bodyType = bodyType;
    }
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

    public BodyType getBodyType() {
        return bodyType;
    }
}
