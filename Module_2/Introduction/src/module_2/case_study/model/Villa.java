package module_2.case_study.model;

public class Villa extends AbstractFacility {

    private String roomStandard;
    private float poolArea;
    private int numberFloor;

    public Villa() {
    }

    public Villa(String id, String name, float area, float cost, int capacity, String rentalType, String roomStandard, float poolArea, int numberFloor) {
        super(id, name, area, cost, capacity, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloor=" + numberFloor +
                ", id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", area=" + getArea() +
                ", cost=" + getCost() +
                ", capacity=" + getCapacity() +
                ", rentalType='" + getRentalType() + '\'' +
                '}';
    }
}
