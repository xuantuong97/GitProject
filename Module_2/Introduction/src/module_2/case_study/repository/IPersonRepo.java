package module_2.case_study.repository;

import java.util.List;

public interface IPersonRepo<E>{
    String COMMA = ",";

    void add(E e);

    List<E> getAll();

    void delete(String id);
    List<E> getDetail(String name);

    void edit(int index, E e);
}
