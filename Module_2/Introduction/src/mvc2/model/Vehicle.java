package mvc2.model;

import java.util.ArrayList;

public abstract class Vehicle {

    private String id;
    private String manufacturer;
    private String year;
    private String owner;



    Vehicle(){};

    public Vehicle(String id, String manufacturer, String year, String owner) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.year = year;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year='" + year + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
