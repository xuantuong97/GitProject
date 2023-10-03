package module_2.case_study.controller;

import module_2.case_study.model.House;
import module_2.case_study.service.IFacilityService;
import module_2.case_study.service.impl.HouseServiceImpl;

import java.util.List;

public class HouseController {

    private final IFacilityService<House> houseIFacilityService = new HouseServiceImpl();

    public List<House> getMaintenance() {
        return houseIFacilityService.getMaintenance();
    }

    public void add(House house) {
        houseIFacilityService.add(house);
    }

    public List<House> getAll() {
        return houseIFacilityService.getAll();
    }

    public void delete(String id) {
        houseIFacilityService.delete(id);
    }
}
