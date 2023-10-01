package module_2.case_study.repository.impl;

import module_2.case_study.model.Customer;
import module_2.case_study.repository.IPersonRepo;
import module_2.case_study.utils.AbstractUtils;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepoImpl extends AbstractUtils<Customer> implements IPersonRepo<Customer> {

    private final String CUSTOMER_PATH = "C:\\Users\\ADMIN\\Documents\\GitProject\\Module_2\\Introduction\\src\\module_2\\case_study\\data\\customer.csv";
    private final String COMMA = ",";
    @Override
    public void add(Customer customer) {
        List<Customer> customers = readCustomerFromFile();
        customers.add(customer);
        writeCustomerToFile(customers);
    }

    @Override
    public List<Customer> getAll() {
        return readCustomerFromFile();
    }

    @Override
    public void delete(String id) {
        List<Customer> customers = readCustomerFromFile();
        for(Customer customer: customers){
            if(customer.getCustomerID().equals(id)){
                customers.remove(customer);
                break;
            }
        }
        writeCustomerToFile(customers);

    }

    @Override
    public List<Customer> getDetail(String name) {
        List<Customer> customers = readCustomerFromFile();
        List<Customer> data = new ArrayList<>();
        for(Customer customer: customers){
            if(customer.getName().equals(name)){
                data.add(customer);
            }
        }
        return data;
    }

    @Override
    public void edit(int index, Customer customer) {

        List<Customer> customers = readCustomerFromFile();
        customers.set(index, customer);
        writeCustomerToFile(customers);
    }

    private List<String> convertCustomerToString(List<Customer> customers){
        List<String> data = new ArrayList<>();
        for(Customer customer : customers){
            data.add(
                    customer.getCustomerID()
                    + COMMA + customer.getName()
                    + COMMA + customer.getId()
                    + COMMA + customer.getDob()
                    + COMMA + customer.getGender()
                    + COMMA + customer.getPhoneNumber()
                    + COMMA + customer.getEmail()
                    + COMMA + customer.getType()
                    + COMMA + customer.getAddress()
            );
        }
        return data;
    }

    private List<Customer> convertStringToCustomer(List<String> stringList){
        List<Customer> data = new ArrayList<>();
        for(String str : stringList){
            String[] strings = str.split(COMMA);
            data.add(
                    new Customer(
                            strings[0],
                            strings[1],
                            strings[2],
                            strings[3],
                            strings[4],
                            strings[5],
                            strings[6],
                            strings[7],
                            strings[8]
                    )
            );
        }
        return data;
    }

    private List<Customer> readCustomerFromFile(){
        List<String> data = readFile(CUSTOMER_PATH);
        return convertStringToCustomer(data);
    }

    private void writeCustomerToFile(List<Customer> customers){
        List<String> data = convertCustomerToString(customers);
        writeFile(CUSTOMER_PATH,data);
    }

}
