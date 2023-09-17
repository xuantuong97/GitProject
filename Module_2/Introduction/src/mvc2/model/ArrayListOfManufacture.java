package mvc2.model;

import java.util.ArrayList;

public class ArrayListOfManufacture {

    public ArrayListOfManufacture(){};

    public ArrayList<Manufacturer> getManufacturerArrayList(){
        ArrayList<Manufacturer> manufacturerArrayList = new ArrayList<>(5);
        manufacturerArrayList.add(new Manufacturer("Y01", "Yamaha", "Japan"));
        manufacturerArrayList.add(new Manufacturer("H01", "Honda", "Japan"));
        manufacturerArrayList.add(new Manufacturer("T01", "Toyota", "Japan"));
        manufacturerArrayList.add(new Manufacturer("F01", "Ford", "USA"));
        manufacturerArrayList.add(new Manufacturer("C01", "Chevrolet", "USA"));

        return manufacturerArrayList;
    }
}
