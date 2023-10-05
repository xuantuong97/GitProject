package module_2.case_study.service.impl;

import module_2.case_study.model.AbstractFacility;
import module_2.case_study.repository.IFacilityRepo;
import module_2.case_study.repository.impl.FacilityRepoImpl;
import module_2.case_study.service.IFacilityService;

import java.util.List;
import java.util.Set;

public class FacilityServiceImpl<T extends AbstractFacility> implements IFacilityService<T> {
    private final IFacilityRepo<T> facilityRepo = new FacilityRepoImpl<>();
    @Override
    public Set<T> getMaintenance() {
        return facilityRepo.getMaintenance();
    }

    @Override
    public void add(T t) {
        facilityRepo.add(t);
    }

    @Override
    public Set<T> getAll() {
        return facilityRepo.getAll();
    }

    @Override
    public void delete(String id) {
        facilityRepo.delete(id);
    }
}
