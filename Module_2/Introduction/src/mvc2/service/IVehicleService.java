package mvc2.service;

import java.util.ArrayList;

public interface IVehicleService<E> {
    void addVehicle(E e);

    ArrayList<E> displayVehicle();

    void removeVehicle(int id);

    E getVehicleDetail(int id);
}
