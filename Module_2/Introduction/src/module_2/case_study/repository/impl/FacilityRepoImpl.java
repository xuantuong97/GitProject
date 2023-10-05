package module_2.case_study.repository.impl;

import module_2.case_study.model.AbstractFacility;
import module_2.case_study.repository.IFacilityRepo;

import java.util.*;


public class FacilityRepoImpl<T extends AbstractFacility> implements IFacilityRepo<T> {

    private final Map<T, Integer> mapFacility = new LinkedHashMap<>();

    @Override
    public Set<T> getMaintenance() {
        Set<T> data = mapFacility.keySet();
        Set<T> result = new HashSet<>();

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
    public Set<T> getAll() {
        return mapFacility.keySet();
    }

    @Override
    public void delete(String id) {
        Set<T> data = mapFacility.keySet();
        for(T t : data){
            if(t.getId().equals(id)){
                mapFacility.remove(t);
            }
        }
    }
}
