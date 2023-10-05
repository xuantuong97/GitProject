package module_2.case_study.service;

import java.util.List;

public interface IPersonService<E> {

    void add(E e);

    List<E> getAll();

    void delete(String id);

    List<E> getDetail(String name);

    void edit(int index, E e);
}
