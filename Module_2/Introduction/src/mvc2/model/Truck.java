package mvc2.model;

public class Truck extends Vehicle {

    private int loadAbility;

    Truck(){};

    public Truck(int loadAbility) {
        this.loadAbility = loadAbility;
    }

    public Truck(String id, String manufacturer, String year, String owner, int loadAbility) {
        super(id, manufacturer, year, owner);
        this.loadAbility = loadAbility;
    }

    public int getLoadAbility() {
        return loadAbility;
    }

    public void setLoadAbility(int loadAbility) {
        this.loadAbility = loadAbility;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                "loadAbility=" + loadAbility +
                '}';
    }
}
