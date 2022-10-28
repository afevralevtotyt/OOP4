package driver;

import utilits.Utilits;


public abstract class Driver{

    private final String FULL_NAME;
    private boolean driversPermit;
    private int experience;


    public Driver(String fullName, boolean driversPermit, int experience) {
        this.FULL_NAME = Utilits.checkValidStringOrDefault(fullName, "Безымянный водитель");
        this.experience = Math.max(0, experience);
        setDriversPermit(driversPermit);
    }

    public String getFULL_NAME() {
        return FULL_NAME;
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
