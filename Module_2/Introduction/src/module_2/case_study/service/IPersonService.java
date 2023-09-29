package module_2.case_study.service;

import java.util.List;

public interface IPersonService<E> extends IGeneralService<E> {

    List<E> getDetail(String name);

    void edit(int index, E e);
}
