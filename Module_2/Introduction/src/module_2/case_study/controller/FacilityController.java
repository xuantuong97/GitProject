package module_2.case_study.controller;

import module_2.case_study.model.AbstractFacility;
import module_2.case_study.service.IFacilityService;
import module_2.case_study.service.impl.FacilityServiceImpl;

import java.util.List;
import java.util.Set;

public class FacilityController<T extends AbstractFacility>{

    private final IFacilityService<T> facilityService = new FacilityServiceImpl<>();

    public Set<T> getMaintenance() {
        return facilityService.getMaintenance();
    }


    public void add(T t) {
        facilityService.add(t);
    }


    public Set<T> getAll() {
        return facilityService.getAll();
    }


    public void delete(String id) {
        facilityService.delete(id);
    }
}
