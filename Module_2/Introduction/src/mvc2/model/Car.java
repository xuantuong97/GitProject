package mvc2.model;

public class Car extends Vehicle{

    private int numberOfSeat;
    private String model;

    Car(){};

    public Car(int numberOfSeat, String model) {
        this.numberOfSeat = numberOfSeat;
        this.model = model;
    }

    public Car(String id, String manufacturer, String year, String owner, int numberOfSeat, String model) {
        super(id, manufacturer, year, owner);
        this.numberOfSeat = numberOfSeat;
        this.model = model;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "numberOfSeat=" + numberOfSeat +
                ", model='" + model + '\'' +
                '}';
    }
}
