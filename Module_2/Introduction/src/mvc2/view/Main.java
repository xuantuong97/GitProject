package mvc2.view;

import mvc2.model.Car;
import mvc2.model.Motorcycle;
import mvc2.model.Truck;

public class Main {
    public static void main(String[] args) {

         Car car1 = new Car("001", "Yamaha","2000",
                "tuong",4,"sedan");

        Car car2 = new Car("001", "Yamaha","2002",
                "tuong",4,"sedan");

         Truck truck = new Truck("001", "Yamaha","2000",
                "tuong",12);

         Motorcycle motorcycle = new Motorcycle("001", "Yamaha","2000",
                "tuong", 12);

         VehicleView vehicleView = new VehicleView();

         vehicleView.addVehicle(car1);
         vehicleView.addVehicle(car2);
         vehicleView.addVehicle(truck);
         vehicleView.addVehicle(motorcycle);

         vehicleView.displayMenu();

    }
}
