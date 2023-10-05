package module_2.case_study.repository;

import java.util.List;
import java.util.Set;

public interface IFacilityRepo<E>  {
    void add(E e);

    Set<E> getAll();

    void delete(String id);

    Set<E> getMaintenance();
}
