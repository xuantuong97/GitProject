package mvc2.service.impl;

import mvc2.repository.IVehicleRepo;
import mvc2.repository.impl.VehicleRepoImpl;
import mvc2.service.IVehicleService;

import java.util.ArrayList;

public class VehicleServiceImpl<E> implements IVehicleService<E> {

    private final IVehicleRepo<E> vehicleRepo = new VehicleRepoImpl();

    @Override
    public void addVehicle(E e) {
        vehicleRepo.addVehicle(e);
    }

    @Override
    public ArrayList<E> displayVehicle() {
        return vehicleRepo.displayVehicle();
    }

    @Override
    public E getVehicleDetail(int id) {
        return vehicleRepo.getVehicleDetail(id);
    }

    @Override
    public void removeVehicle(int id) {
        vehicleRepo.removeVehicle(id);
    }
}
