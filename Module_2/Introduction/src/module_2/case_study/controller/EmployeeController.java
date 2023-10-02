package module_2.case_study.controller;

import module_2.case_study.model.Employee;
import module_2.case_study.service.IPersonService;
import module_2.case_study.service.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {
    private final IPersonService<Employee> employeeIPersonService = new EmployeeServiceImpl();

    public void add(Employee employee) {
        employeeIPersonService.add(employee);
    }

    public List<Employee> getAll() {
        return employeeIPersonService.getAll();
    }

    public void delete(String id) {
        employeeIPersonService.delete(id);
    }

    public List<Employee> getDetail(String name) {
        return employeeIPersonService.getDetail(name);
    }

    public void edit(int index, Employee employee) {
        employeeIPersonService.edit(index, employee);
    }
}
