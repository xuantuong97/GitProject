package module_2.case_study.service.impl;

import module_2.case_study.model.House;
import module_2.case_study.repository.IFacilityRepo;
import module_2.case_study.repository.impl.HouseRepoImpl;
import module_2.case_study.service.IFacilityService;

import java.util.List;

public class HouseServiceImpl implements IFacilityService<House> {

    private final IFacilityRepo<House> houseIFacilityRepo = new HouseRepoImpl();
    @Override
    public List<House> getMaintenance() {
        return houseIFacilityRepo.getMaintenance();
    }

    @Override
    public void add(House house) {
        houseIFacilityRepo.add(house);
    }

    @Override
    public List<House> getAll() {
        return houseIFacilityRepo.getAll();
    }

    @Override
    public void delete(String id) {
        houseIFacilityRepo.delete(id);
    }
}
