package module_2.case_study.repository.impl;

import module_2.case_study.model.House;
import module_2.case_study.repository.IFacilityRepo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HouseRepoImpl implements IFacilityRepo<House> {

    private final Map<House, Integer> houseMap = new LinkedHashMap<House,Integer>();


    @Override
    public void add(House house) {
        houseMap.put(house, 0);
    }

    @Override
    public List<House> getAll() {
        List<House> data = new ArrayList<>(houseMap.keySet());
        return data;
    }

    @Override
    public void delete(String id) {
        List<House> data = new ArrayList<>(houseMap.keySet());
        for(House house : data){
            if(house.getId().equals(id)){
                houseMap.remove(house);
                break;
            }
        }
    }

    @Override
    public List<House> getMaintenance() {
        List<House> data = new ArrayList<>(houseMap.keySet());
        List<House> result = new ArrayList<>();

        for(House house : data){
            if(house.isMaintenance()){
                result.add(house);
            }
        }
        return result;
    }
}
