package module_2.case_study.repository;

import java.util.List;

public interface IPersonRepo<E> extends IGeneral<E>{
    String COMMA = ",";
    List<E> getDetail(String name);

    void edit(int index, E e);
}