package module_2.case_study.service;

import java.util.List;

public interface IFacilityService<E> extends IGeneralService<E>{
    List<E> getMaintenance();
}
