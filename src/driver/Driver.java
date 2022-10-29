package driver;

import utilits.Utilits;


public abstract class Driver{

    private final String fullName;
    private boolean driversPermit;
    private int experience;


    public Driver(String fullName, boolean driversPermit, int experience) {
        this.fullName = Utilits.checkValidStringOrDefault(fullName, "Безымянный водитель");
        this.experience = Math.max(0, experience);
        setDriversPermit(driversPermit);
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



}
