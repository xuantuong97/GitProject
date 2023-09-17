package mvc2.model;

public class Motorcycle extends Vehicle{

    private int power;

    Motorcycle(){};

    public Motorcycle(int power) {
        this.power = power;
    }

    public Motorcycle(String id, String manufacturer, String year, String owner, int power) {
        super(id, manufacturer, year, owner);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "License plate: " + getId()
                + "\tmanufacturer: " + getManufacturer()
                + "\tyear: " + getYear()
                + "\towner: " + getOwner()
                + "\tpower: " + getPower()
                ;
    }
}
