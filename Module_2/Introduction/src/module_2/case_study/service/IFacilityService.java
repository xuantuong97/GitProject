package module_2.case_study.service;

import java.util.List;
import java.util.Set;

public interface IFacilityService<E> {
    void add(E e);

    Set<E> getAll();

    void delete(String id);
    Set<E> getMaintenance();
}
