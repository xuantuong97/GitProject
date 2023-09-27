package module_2.case_study.model;

public abstract class AbstractFacility {

    protected String id;
    protected String name;
    protected float area;
    protected float cost;
    protected int capacity;
    protected String rentalType;

    public AbstractFacility() {
    }

    public AbstractFacility(String id, String name, float area, float cost, int capacity, String rentalType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.capacity = capacity;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

}
