package transport;
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

    public String getCapacity() {
        if (capacity != null) {
            return capacity;
        } else {
            return "Недостаточно данных";
        }
    }
}