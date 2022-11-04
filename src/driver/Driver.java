package driver;

import utilits.Utilits;


public abstract class Driver{

    private final String fullName;
    private boolean driversPermit;
    private int experience;
    private String driversCategory;


    public Driver(String fullName, boolean driversPermit, int experience, String driversCategory) {
        this.fullName = Utilits.checkValidStringOrDefault(fullName, "Безымянный водитель");
        this.experience = Math.max(0, experience);
        setDriversPermit(driversPermit);
        setDriversCategory(driversCategory);
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isDriversPermit() {
        return driversPermit;
    }


    public void setDriversPermit(boolean droversPermit) {
        this.driversPermit = droversPermit;
    }

    public int getExperience() {
        return experience;
    }

    public void setDriversCategory(String driversCategory) {
            if (driversCategory.equals("B")||driversCategory.equals("C")||driversCategory.equals("D")){
                this.driversCategory = driversCategory;
            } else {
                throw new IllegalArgumentException("Необходимо указать тип прав");
            }
    }

    public String getDriversCategory() {
        return driversCategory;
    }
}
