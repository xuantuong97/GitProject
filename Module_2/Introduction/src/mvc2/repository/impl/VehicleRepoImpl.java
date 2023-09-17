package mvc2.repository.impl;

import mvc2.repository.IVehicleRepo;

import java.util.ArrayList;

public class VehicleRepoImpl<E> implements IVehicleRepo<E> {

    private final ArrayList<E> vehicles = new ArrayList<>();

    @Override
    public void addVehicle(E e) {
        vehicles.add(e);
    }

    @Override
    public ArrayList<E> displayVehicle() {
        return vehicles;
    }

    @Override
    public E getVehicleDetail(int id) {
        return vehicles.get(id);
    }

    @Override
    public void removeVehicle(int id) {
        vehicles.remove(id);
    }
}
