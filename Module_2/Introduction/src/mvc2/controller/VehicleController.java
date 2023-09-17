package mvc2.controller;

import mvc2.service.IVehicleService;
import mvc2.service.impl.VehicleServiceImpl;

import java.util.ArrayList;

public class VehicleController<E> {

    private final IVehicleService<E> vehicleService = new VehicleServiceImpl<>();

    public void addVehicle(E e) {
        vehicleService.addVehicle(e);
    }

    public ArrayList<E> displayVehicle() {
        return vehicleService.displayVehicle();
    }

    public E getVehicleDetail(int id) {
        return vehicleService.getVehicleDetail(id);
    }

    public void removeVehicle(int id) {
        vehicleService.removeVehicle(id);
    }
}
