package module_2.case_study.service;

import java.util.List;

public interface IGeneralService<E> {
    void add(E e);

    List<E> getAll();

    void delete(String id);
}
