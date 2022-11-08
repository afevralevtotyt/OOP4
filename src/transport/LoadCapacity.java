package transport;

public enum LoadCapacity{
    N1("<3,5 тонн"),
    N2("3,5-12 тонн"),
    N3(">12 тонн");


    private String capacity;

    LoadCapacity(String capacity) {
        this.capacity = capacity;
    }


    public String getCapacity() {
        return capacity;
        }
}
