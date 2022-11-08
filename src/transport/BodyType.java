package transport;

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


    BodyType(String bodyTypeRu) {
        this.bodyTypeRu = bodyTypeRu;
    }



    public String getBodyTypeRu() {
        return bodyTypeRu;
    }


}