package mvc2.model;

import java.util.ArrayList;

 public class Manufacturer {
    private static String id;
    private static String name;
    private static String country;



    Manufacturer(){};

    public Manufacturer(String id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }



    public String getCountry() {
        return country;
    }


    @Override
    public String toString() {
        return "Manufacturer: "
                + getId() +" " + getName() +" " + getCountry();
    }
}
