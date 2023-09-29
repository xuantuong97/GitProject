package module_2.case_study.service.impl;

import module_2.case_study.model.Customer;
import module_2.case_study.repository.IPersonRepo;
import module_2.case_study.repository.impl.CustomerRepoImpl;
import module_2.case_study.service.IPersonService;

import java.util.List;

public class CustomerServiceImpl implements IPersonService<Customer> {

    private final IPersonRepo<Customer> personRepo = new CustomerRepoImpl();
    @Override
    public void add(Customer customer) {
        personRepo.add(customer);
    }

    @Override
    public List<Customer> getAll() {
        return personRepo.getAll();
    }

    @Override
    public void delete(String id) {
        personRepo.delete(id);
    }

    @Override
    public List<Customer> getDetail(String name) {
        return personRepo.getDetail(name);
    }

    @Override
    public void edit(int index, Customer customer) {
        personRepo.edit(index, customer);
    }
}
