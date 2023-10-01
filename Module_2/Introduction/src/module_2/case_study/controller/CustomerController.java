package module_2.case_study.controller;

import module_2.case_study.model.Customer;
import module_2.case_study.service.IPersonService;
import module_2.case_study.service.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    private final IPersonService<Customer> personService = new CustomerServiceImpl();

    public void add(Customer customer) {
        personService.add(customer);
    }


    public List<Customer> getAll() {
        return personService.getAll();
    }


    public void delete(String id) {
        personService.delete(id);
    }


    public List<Customer> getDetail(String name) {
        return personService.getDetail(name);
    }


    public void edit(int index, Customer customer) {
        personService.edit(index, customer);
    }
}
