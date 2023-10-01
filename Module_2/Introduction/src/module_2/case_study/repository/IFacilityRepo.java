package module_2.case_study.repository;

import java.util.List;

public interface IFacilityRepo<E> extends IGeneral<E> {

    List<E> getMaintenance();
}
