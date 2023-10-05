package module_2.case_study.repository.impl;

import module_2.case_study.model.Employee;
import module_2.case_study.repository.IPersonRepo;
import module_2.case_study.utils.AbstractUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoImpl extends AbstractUtils<Employee> implements IPersonRepo<Employee> {
    private final String EMPLOYEE_PATH = "C:\\Users\\ADMIN\\Documents\\GitProject\\Module_2\\Introduction\\src\\module_2\\case_study\\data\\employee.csv";
    public void add(Employee employee) {
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        writeToFile(employees, true);
    }

    @Override
    public List<Employee> getAll() {

        return readFromFile();
    }

    @Override
    public void delete(String id) {
        List<Employee> employees = readFromFile();
        for(Employee employee: employees){
            if (employee.getEmployeeID().equals(id)){
                employees.remove(employee);
                break;
            }
        }
        writeToFile(employees, false);
    }

    @Override
    public List<Employee> getDetail(String name) {
        List<Employee> employees = readFromFile();
        List<Employee> data = new ArrayList<>();

        for(Employee employee: employees){
            if(employee.getName().contains(name)){
                data.add(employee);
            }
        }
        return data;
    }

    @Override
    public void edit(int index, Employee employee) {
        List<Employee> employees = readFromFile();
        employees.set(index, employee);
        writeToFile(employees, false);

    }

    private List<String> convertEmployeeToString(List<Employee> employees){
        List<String> data = new ArrayList<>();
        for(Employee employee : employees){
            data.add(
                  employee.getEmployeeID()
                  + COMMA + employee.getName()
                  + COMMA + employee.getId()
                  + COMMA + employee.getDob()
                  + COMMA + employee.getGender()
                  + COMMA + employee.getPhoneNumber()
                  + COMMA + employee.getEmail()
                  + COMMA + employee.getLevel()
                  + COMMA + employee.getPosition()
                  + COMMA + employee.getSalary()
            );
        }
        return data;
    }

    private List<Employee> convertStringToEmployee(List<String> stringList){
        List<Employee> data = new ArrayList<>();
        for(String string: stringList){
            String[] strings = string.split(COMMA);
            data.add(new Employee(
                    strings[0],
                    strings[1],
                    strings[2],
                    strings[3],
                    strings[4],
                    strings[5],
                    strings[6],
                    strings[7],
                    strings[8],
                    Float.parseFloat(strings[9])
            ));
        }
        return data;
    }

    private List<Employee> readFromFile(){
        List<String> data = readFile(EMPLOYEE_PATH);
        return convertStringToEmployee(data);
    }

    private void writeToFile(List<Employee> employees, boolean check){
        List<String> stringList = convertEmployeeToString(employees);
        writeFile(EMPLOYEE_PATH, stringList, check);
    }
}
