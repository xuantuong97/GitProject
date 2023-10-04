package module_2.case_study.repository.impl;

import module_2.case_study.model.AbstractFacility;
import module_2.case_study.repository.IFacilityRepo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class FacilityRepoImpl<T extends AbstractFacility> implements IFacilityRepo<T> {

    private final Map<T, Integer> mapFacility = new LinkedHashMap<>();

    @Override
    public List<T> getMaintenance() {
        List<T> data = new ArrayList<>(mapFacility.keySet());
        List<T> result = new ArrayList<>();

        for(T t: data){
            if(t.isMaintenance()){
                result.add(t);
            }
        }
        return result;
    }

    @Override
    public void add(T t) {
        mapFacility.put(t, 0);
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(mapFacility.keySet());
    }

    @Override
    public void delete(String id) {
        List<T> data = new ArrayList<>(mapFacility.keySet());
        for(T t : data){
            if(t.getId().equals(id)){
                mapFacility.remove(t);
            }
        }
    }
}
