package module_2.case_study.repository;

import java.util.List;

public interface IGeneral<E> {

    void add(E e);

    List<E> getAll();

    void delete(String id);
}
