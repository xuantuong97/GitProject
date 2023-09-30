package module_2.case_study.model;

public class Room extends AbstractFacility{

    private String freeService;

    public Room() {
    }

    public Room(String id, String name, float area, float cost, int capacity, String rentalType, String freeService) {
        super(id, name, area, cost, capacity, rentalType);
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
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", capacity=" + capacity +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
