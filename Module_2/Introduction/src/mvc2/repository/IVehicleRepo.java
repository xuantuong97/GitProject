package mvc2.repository;

import java.util.ArrayList;

public interface IVehicleRepo<E>{
    void addVehicle(E e);

    ArrayList<E> displayVehicle();

    void removeVehicle(int id);

    E getVehicleDetail(int id);
}
