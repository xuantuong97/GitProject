package mvc2.view;

import mvc2.controller.VehicleController;
import mvc2.model.Car;
import mvc2.model.Motorcycle;
import mvc2.model.Truck;
import mvc2.model.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;


public class VehicleView {



    private final VehicleController<Car> vehicleControllerCar = new VehicleController();
    private final VehicleController<Truck> vehicleControllerTruck = new VehicleController();
    private final VehicleController<Motorcycle> vehicleControllerMotorCycle = new VehicleController();

    private final Scanner scanner = new Scanner(System.in);

    private String licensePlate;

    private String manufacturer;

    private String year;

    private String owner;

    private int indexOfCar = -1;

    private int indexOfTruck = -1;

    private int indexOfMotorCycle = -1;

    private int numberOfRemoveVehicle = 0;

    public void displayMenu(){
        System.out.println("Choose option:");
        System.out.println("1. Add a new vehicle");
        System.out.println("2. Display list of vehicles");
        System.out.println("3. Remove a vehicle");
        System.out.println("4. Search a vehicle");
        System.out.println("5. Exit");

        int choose = Integer.parseInt(scanner.nextLine());

        switch (choose){
            case 1:
                addVehicleByCus();
                displayMenu();
            break;
            case 2:
                displayByCus();
                displayMenu();
            break;
            case 3:
                removeVehicleByCus();
                displayMenu();
            break;
            case 4:
                displayVehicleDetails();
                displayMenu();
            case 5: break;
        }
    }


    public void addVehicle(Vehicle vehicle){

        if (vehicle instanceof Car){
            vehicleControllerCar.addVehicle((Car) vehicle);
        } else if (vehicle instanceof Truck) {
            vehicleControllerTruck.addVehicle((Truck) vehicle);
        }
        else {
            vehicleControllerMotorCycle.addVehicle((Motorcycle) vehicle);
        }
    }

    private void addVehicleDetails(){
        System.out.println("Add license plate:");
        licensePlate = scanner.nextLine();
        System.out.println("Add manufacturer:");
        manufacturer = scanner.nextLine();
        System.out.println("Add year:");
        year = scanner.nextLine();
        System.out.println("Add owner:");
        owner = scanner.nextLine();
    }

    private void addVehicleByCus(){
        System.out.println("Please choose type of vehicle you want to add:");
        System.out.println("1. Car");
        System.out.println("2. Truck");
        System.out.println("3. Motorcycle");

        int choose = Integer.parseInt(scanner.nextLine());

        switch (choose){
            case 1: addCar();
            break;
            case 2: addTruck();
            break;
            case 3: addMotorCycle();
            break;
        }

    }

    private void addCar(){

        addVehicleDetails();

        System.out.println("Add number of seat:");
        int  noFSeat = Integer.parseInt(scanner.nextLine());
        System.out.println("Add model:");
        String model = scanner.nextLine();


        Car car = new Car(licensePlate, manufacturer, year, owner, noFSeat, model);

        addVehicle(car);
    }

    private void addTruck(){

        addVehicleDetails();
        System.out.println("Add load ability:");
        int loadAbility = scanner.nextInt();

        Truck truck = new Truck(licensePlate, manufacturer, year, owner, loadAbility);

        addVehicle(truck);
    }

    private void addMotorCycle(){

        addVehicleDetails();
        System.out.println("Add power:");
        int power = scanner.nextInt();

        Motorcycle motorcycle = new Motorcycle(licensePlate, manufacturer, year, owner, power);

        addVehicle(motorcycle);
    }

    private void displayCars(){
        for (Car car : vehicleControllerCar.displayVehicle()){
            System.out.println(car);
        }
    }

    private void displayTrucks(){
        for (Truck truck : vehicleControllerTruck.displayVehicle()){
            System.out.println(truck);
        }
    }

    private void displayMotorCycles(){
        for (Motorcycle motorcycle : vehicleControllerMotorCycle.displayVehicle()){
            System.out.println(motorcycle);
        }
    }

    private void displayByCus(){
        System.out.println("Please choose the vehicle:");
        System.out.println("1. Car");
        System.out.println("2. Truck");
        System.out.println("3. Motorcycle");
        int choose = Integer.parseInt(scanner.nextLine());

        switch (choose){
            case 1: displayCars();
            break;
            case 2: displayTrucks();
            break;
            case 3: displayMotorCycles();
            break;
        }
    }

    private void getIndexOfVehicle(String licensePlate){
        for (int i = 0; i< vehicleControllerCar.displayVehicle().size(); i++){
            if(vehicleControllerCar.displayVehicle().get(i).getId().equals(licensePlate)){
                indexOfCar = i;
                break;
            }
        }

        for (int i = 0; i< vehicleControllerTruck.displayVehicle().size(); i++){
            if(vehicleControllerTruck.displayVehicle().get(i).getId().equals(licensePlate)){
                indexOfTruck = i;
                break;
            }
        }

        for (int i = 0; i< vehicleControllerMotorCycle.displayVehicle().size(); i++){
            if(vehicleControllerMotorCycle.displayVehicle().get(i).getId().equals(licensePlate)){
                indexOfMotorCycle = i;
                break;
            }
        }

    }

    private void removeVehicleByCus(){
        System.out.println("Please enter the license plate");
        String licensePlate = scanner.nextLine();

        getIndexOfVehicle(licensePlate);

        if ((indexOfCar + indexOfTruck + indexOfMotorCycle) != -3){
            System.out.println("Do you want to remove vehicles have the license plate: "+ licensePlate);
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    removeCar();
                    removeTruck();
                    removeMotorCycle();
                    System.out.println(numberOfRemoveVehicle + " vehicles have been removed");
                    break;
                case 2:
                    displayMenu();
                    break;
            }
        }
        else {
            System.out.println("Not found the license plate.");
        }

    }

    private void removeCar(){

        if (indexOfCar != -1){
            vehicleControllerCar.removeVehicle(indexOfCar);
            numberOfRemoveVehicle ++;
        }
    }

    private void removeTruck(){

        if (indexOfTruck != -1){
            vehicleControllerTruck.removeVehicle(indexOfTruck);
            numberOfRemoveVehicle ++;
        }
    }


    private void removeMotorCycle(){

        if (indexOfMotorCycle != -1){
            vehicleControllerMotorCycle.removeVehicle(indexOfMotorCycle);
            numberOfRemoveVehicle ++;
        }
    }

    private void displayVehicleDetails(){
        System.out.println("Please enter the license plate");
        String licensePlate = scanner.nextLine();

        getIndexOfVehicle(licensePlate);

        if ((indexOfCar + indexOfTruck + indexOfMotorCycle) != -3){
            displayCarDetails();
            displayTruckDetails();
            displayMotorCycleDetails();
        }
        else {
            System.out.println("Not found any vehicle!");
        }
    }

    private void displayCarDetails(){
        if (indexOfCar != -1){
            System.out.println("The car: ");
            System.out.println(vehicleControllerCar.getVehicleDetail(indexOfCar));
        }
    }

    private void displayTruckDetails(){
        if (indexOfTruck != -1){
            System.out.println("The truck: ");
            System.out.println(vehicleControllerTruck.getVehicleDetail(indexOfTruck));
        }
    }

    private void displayMotorCycleDetails(){
        if (indexOfMotorCycle != -1){
            System.out.println("The motorcycle: ");
            System.out.println(vehicleControllerMotorCycle.getVehicleDetail(indexOfMotorCycle));
        }
    }
}
