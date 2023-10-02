package module_2.case_study.service.impl;

import module_2.case_study.model.Employee;
import module_2.case_study.repository.IPersonRepo;
import module_2.case_study.repository.impl.EmployeeRepoImpl;
import module_2.case_study.service.IPersonService;

import java.util.List;

public class EmployeeServiceImpl implements IPersonService<Employee> {
    private final IPersonRepo<Employee> employeeIPersonRepo = new EmployeeRepoImpl();
    @Override
    public void add(Employee employee) {
        employeeIPersonRepo.add(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeIPersonRepo.getAll();
    }

    @Override
    public void delete(String id) {
        employeeIPersonRepo.delete(id);
    }

    @Override
    public List<Employee> getDetail(String name) {
        return employeeIPersonRepo.getDetail(name);
    }

    @Override
    public void edit(int index, Employee employee) {
        employeeIPersonRepo.edit(index, employee);
    }


}
