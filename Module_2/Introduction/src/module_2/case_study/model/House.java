package module_2.case_study.model;

public class House extends AbstractFacility{

    private String roomStandard;
    private int numberFloor;

    public House() {
    }

    public House(String id, String name, float area, float cost, int capacity, String rentalType, String roomStandard, int numberFloor) {
        super(id, name, area, cost, capacity, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberFloor=" + numberFloor +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", capacity=" + capacity +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

}
