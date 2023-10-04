package module_2.case_study.model;

public class Room extends AbstractFacility{

    private String freeService;

    public Room() {
    }

    public Room(String id, String name, float area, float cost, int capacity, String rentalType, boolean isMaintenance, String freeService) {
        super(id, name, area, cost, capacity, rentalType, isMaintenance);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", area=" + getArea() +
                ", cost=" + getCost() +
                ", capacity=" + getCapacity() +
                ", rentalType='" + getRentalType() + '\'' +
                '}';
    }
}
