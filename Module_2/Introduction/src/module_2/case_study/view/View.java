package module_2.case_study.view;


import module_2.case_study.controller.CustomerController;
import module_2.case_study.controller.EmployeeController;
import module_2.case_study.controller.HouseController;
import module_2.case_study.model.Customer;
import module_2.case_study.model.Employee;
import module_2.case_study.model.House;
import module_2.case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class View {
    private final CustomerController customerController = new CustomerController();
    private final EmployeeController employeeController = new EmployeeController();
    private final HouseController houseController = new HouseController();
    private final Scanner scanner = new Scanner(System.in);

    public void mainMenu(){
        int choose;
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit");

            choose = choose(1,6);
            switch (choose){
                case 1: employeeMenu();
                    break;
                case 2: customerMenu();
                    break;
                case 3: facilityMenu();
                    break;
                case 4: bookingMenu();
                    break;
                case 5: promotionMenu();
                    break;
                case 6: System.exit(0);
                    break;
            }
    }

    private void customerMenu(){
        int choose;
        do {
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tDelete customer\n" +
                    "5.\tSearch by name customer\n" +
                    "6.\tReturn main menu\n");
            choose = choose(1, 6);
            switch (choose){
                case 1: displayAllCustomer();
                    break;
                case 2: addFullInformationOfCus();
                    break;
                case 3: editCustomerInfo();
                    break;
                case 4: deleteCustomer();
                    break;
                case 5: searchCustomerByName();
                    break;
                case 6:
                    break;
            }
        }
        while (choose != 6);
        mainMenu();
    }

    private void employeeMenu(){
        int choose;
        do {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tDelete employee\n" +
                    "5\tSearch by name employee\n" +
                    "6\tReturn main menu\n");
            choose = choose(1,6);
            switch (choose){
                case 1: displayAllEmployees();
                break;
                case 2: addAllInformationOfEmp();
                break;
                case 3: editEmployee();
                break;
                case 4: deleteEmployee();
                break;
                case 5: searchEmployee();
                break;
                case 6: break;
            }
        }while (choose !=6);
        mainMenu();
    }

    private void facilityMenu(){
        int choose;
        do {

            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tDelete facility\n" +
                    "5\tReturn main menu\n");
            choose = choose(1,5);
            switch (choose){
                case 1: displayAllHouse();
                break;
                case 2: addFacilityMenu();
                break;
                case 3: displayMaintenance();
                break;
                case 4: deleteFacilityMenu();
                break;
                default:
                break;
            }
        }while (choose!=5);
        mainMenu();
    }

    private void addFacilityMenu(){
        int choose;
        do{
            System.out.println("1. Add new house" +
                    "\n2. Add new room" +
                    "\n3. Add new villa" +
                    "\n4. Back to menu");
            choose = choose(1,4);
            switch (choose){
                case 1: addFullHouseInfo();
                break;
                default: break;
            }

        }while (choose != 4);
        facilityMenu();
    }

    private void deleteFacilityMenu(){
        int choose;
        do{
            System.out.println("1. Delete a house" +
                    "\n2. Delete a room" +
                    "\n3. Delete a villa" +
                    "\n4. Delete a menu");
            choose = choose(1,4);
            switch (choose){
                case 1: addFullHouseInfo();
                    break;
                default: break;
            }

        }while (choose != 4);
        facilityMenu();
    }

    private void bookingMenu(){
        int choose;
        do{
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new contracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            choose = choose(1,6);
        }while (choose != 6);
        mainMenu();
    }

    private void promotionMenu(){
        int choose;
        do{
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            choose = choose(1,3);
        }while (choose !=3);
        mainMenu();
    }

    private int choose(int min, int max){
        int choose = 0;
        do{
            try{
                choose = Integer.parseInt(scanner.nextLine());
                if(choose < min || choose > max){
                    throw new NumberFormatException();
                }
            }
            catch (NumberFormatException e){
                System.out.println("Input must be a integer and in the range");
            }
            catch (Exception e){
                System.out.println("Not valid input");
            }
        }
        while (choose < min || choose > max);
        return choose;
    }

    private void displayAllCustomer(){
        for(Customer customer: customerController.getAll()){
            System.out.println(customer);
        }
    }
    // Add information for new customer

    private void addFullInformationOfCus(){
        System.out.println("Enter customer ID");
        String customerID = addCustomerID();
        System.out.println("Enter customer name");
        String customerName = addName();
        System.out.println("Enter customer ID card number");
        String customerIDCard = addIDCard();
        System.out.println("Enter customer day of birth");
        String customerDOB = addDOB();
        System.out.println("Enter customer gender");
        String customerGender = addGender();
        System.out.println("Enter customer phone number");
        String customerPhone = addPhoneNumber();
        System.out.println("Enter customer email");
        String customerEmail = addEmail();
        System.out.println("Enter customer type");
        String customerType = addCustomerType();
        System.out.println("Enter customer address");
        String customerAddress = addAddress();

        Customer customer = new Customer(customerID, customerName, customerIDCard, customerDOB,
                customerGender, customerPhone, customerEmail, customerType, customerAddress);
        customerController.add(customer);
    }


    private String addCustomerID(){
        do{
            try {
                String customerID = scanner.nextLine();
                if(Regex.validateCustomerID(customerID)){
                    return customerID;
                }
                else {
                    throw new Exception();
                }
            }catch (Exception e){
                System.out.println("The ID is not valid");
            }

        }while (true);
    }

    private String addName(){
        do{
            try {
                String fullName = scanner.nextLine();
                if(Regex.checkFullName(fullName)){
                    return fullName;
                }
                else {
                    throw new Exception();
                }
            }catch (Exception e){
                System.out.println("The name is not valid");
            }
        }while (true);
    }

    private String addIDCard(){
        do{
            try {
                String idCard = scanner.nextLine();
                if(Regex.validateCMND(idCard)){
                    return idCard;
                }
                else {
                    throw new Exception();
                }
            }catch (Exception e){
                System.out.println("The ID card is not valid");
            }

        }while (true);
    }

    private String addDOB(){
        do{
            try{
                String dob = scanner.nextLine();
                if(!Regex.validateDate(dob)){
                   throw new Exception();
                }
                if(!Regex.checkValidDate(dob)){
                    throw new RuntimeException();
                }
                if(Regex.calAge(dob) < 18){
                    throw new RuntimeException();
                }
                return dob;
            }
            catch (RuntimeException e){
                System.out.println("The date is not valid or the age less than 18");
            }
            catch (Exception e){
                System.out.println("The input must has format dd/MM/yyyy");
            }
        }
        while(true);
    }

    private String addGender(){
        do{
            try{
                return scanner.nextLine();
            }catch (Exception e){
                System.out.println("The input is not valid");
            }
        }
        while(true);
    }

    private String addPhoneNumber(){
        do{
            try{
                String phoneNumber = scanner.nextLine();
                if(Regex.validatePhone(phoneNumber)){
                    return phoneNumber;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("The phone number is valid or wrong format");
            }
        }while (true);
    }

    private String addEmail(){
        do{
            try{
                return scanner.nextLine();
            }catch (Exception e){
                System.out.println("The input is not valid");
            }
        }
        while(true);
    }

    private String addCustomerType(){
        do{
            try{
                return scanner.nextLine();
            }catch (Exception e){
                System.out.println("The input is not valid");
            }
        }
        while(true);
    }

    private String addAddress(){
        do{
            try{
                return scanner.nextLine();
            }catch (Exception e){
                System.out.println("The input is not valid");
            }
        }
        while(true);
    }

    // Edit customer information.

    private int getIndexByCustomerId(String id){
        int index = -1;
        List<Customer> customers = customerController.getAll();
        for(int i=0; i<customers.size(); i++){
            if(customers.get(i).getCustomerID().equals(id)){
                index = i;
                return index;
            }
        }
        return index;
    }

    private void editCustomerInfo(){
        System.out.println("Enter customer ID");
        String customerId = addCustomerID();
        int index = getIndexByCustomerId(customerId);
        if(index == -1){
            System.out.println("ID is not exist.");
        }
        else {
            Customer customer = customerController.getAll().get(index);
            int choose;
            do{
                System.out.println("Choose option:\n" +
                        "1. Edit name\n"+
                        "2. Edit ID card number\n"+
                        "3. Edit day of birth\n"+
                        "4. Edit gender\n"+
                        "5. Edit phone number\n"+
                        "6. Edit mail\n"+
                        "7. Edit type\n"+
                        "8. Edit address\n"+
                        "9. Finish edit"
                );
                choose = choose(1,9);
                switch (choose){
                    case 1:
                        System.out.println("Enter customer name");
                        String customerName = addName();
                        customer.setName(customerName);
                        break;
                    case 2:
                        System.out.println("Enter customer ID card number");
                        String customerIDCard = addIDCard();
                        customer.setId(customerIDCard);
                        break;
                    case 3:
                        System.out.println("Enter customer day of birth");
                        String customerDOB = addDOB();
                        customer.setDob(customerDOB);
                        break;
                    case 4:
                        System.out.println("Enter customer gender");
                        String customerGender = addGender();
                        customer.setGender(customerGender);
                        break;
                    case 5:
                        System.out.println("Enter customer phone number");
                        String customerPhone = addPhoneNumber();
                        customer.setPhoneNumber(customerPhone);
                        break;
                    case 6:
                        System.out.println("Enter customer email");
                        String customerEmail = addEmail();
                        customer.setEmail(customerEmail);
                        break;
                    case 7:
                        System.out.println("Enter customer type");
                        String customerType = addCustomerType();
                        customer.setType(customerType);
                        break;
                    case 8:
                        System.out.println("Enter customer address");
                        String customerAddress = addAddress();
                        customer.setAddress(customerAddress);
                        break;
                    default: break;
                }
            }
            while (choose!=9);

            customerController.edit(index, customer);
        }
    }

    // Delete Customer

    private void deleteCustomer(){
        System.out.println("Enter customer ID");
        String customerID = addCustomerID();
        int index = getIndexByCustomerId(customerID);
        if(index == -1){
            System.out.println("The ID is not exist");
        }
        else {
            System.out.println("Do you want remove this customer\n" +
                    "1. Yes\n" +
                    "2. No");
            int choose = choose(1, 2);
            if (choose == 1) {
                customerController.delete(customerID);
                System.out.println("The customer has been removed.");
            }
        }
    }

    // Search customer

    private void searchCustomerByName(){
        System.out.println("Enter customer name");
        String name = addName();
        List<Customer> customers = customerController.getDetail(name);
        if(customers.size()<1){
            System.out.println("Not exist customer with name: "+name);
        }
        else {
            for(Customer customer: customers){
                System.out.println(customer);
            }
        }
    }

    /*============== Employee ========*/

    private String addEmployeeID(){
        do{
            String empID = scanner.nextLine();
            if(Regex.validateEmployeeID(empID)){
                return empID;
            }
            System.out.println("Employee ID is not valid");
        }
        while (true);
    }

    private String addEmployeeLevel(){
        do{
            try{
              return scanner.nextLine();
            }
            catch (Exception e){
                System.out.println("The input is not valid");
            }
        }
        while (true);
    }

    private String addEmployeePosition(){
        do{
            try{
               return scanner.nextLine();
            }
            catch (Exception e){
                System.out.println("The input is not valid");
            }
        }
        while (true);
    }

    private float addEmployeeSalary(){
        do{
            try{
                float salary = Float.parseFloat(scanner.nextLine());
                if(Regex.validateSalary(salary)){
                    return salary;
                }
                throw new NumberFormatException();
            }
            catch (NumberFormatException e){
                System.out.println("The salary must be a number and greater than 0");
            }
            catch (Exception e){
                System.out.println("Not valid input");
            }
        }
        while (true);
    }

    // Display Employee

    private void displayAllEmployees(){
        List<Employee> employees = employeeController.getAll();
        for(Employee employee: employees){
            System.out.println(employee);
        }
    }
    // Add Employee

    private void addAllInformationOfEmp(){
        System.out.println("Enter employee ID");
        String empID = addEmployeeID();
        System.out.println("Enter employee name");
        String empName = addName();
        System.out.println("Enter employee card ID");
        String idCard = addIDCard();
        System.out.println("Enter employee day of birth");
        String empDOB = addDOB();
        System.out.println("Enter employee gender");
        String empGender = addGender();
        System.out.println("Enter employee phone number");
        String empPhone = addPhoneNumber();
        System.out.println("Enter employee email");
        String empEmail = addEmail();
        System.out.println("Enter employee level");
        String empLevel = addEmployeeLevel();
        System.out.println("Enter employee position");
        String empPosition = addEmployeePosition();
        System.out.println("Enter employee salary");
        float empSalary = addEmployeeSalary();
        employeeController.add(new Employee(
                empID, empName, idCard, empDOB, empGender, empPhone, empEmail, empLevel,
                empPosition, empSalary
        ));
    }

    private int getIndexByEmployeeID(String id){
        int index = -1;
        List<Employee> employees = employeeController.getAll();
        for(int i = 0; i< employees.size(); i++){
            if (employees.get(i).getEmployeeID().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    private void editEmployee(){
        System.out.println("Enter employee ID");
        String empID = addEmployeeID();
        int index = getIndexByEmployeeID(empID);
        if(index == -1){
            System.out.println("The ID is not exist");
        }
        else {
            int choose;
            Employee employee = employeeController.getAll().get(index);
            do{
                System.out.println("Choose option:\n" +
                        "1. Edit name\n"+
                        "2. Edit ID card number\n"+
                        "3. Edit day of birth\n"+
                        "4. Edit gender\n"+
                        "5. Edit phone number\n"+
                        "6. Edit mail\n"+
                        "7. Edit level\n"+
                        "8. Edit position\n"+
                        "9. Edit salary\n"+
                        "10. Finish edit"
                );
                choose = choose(1,10);
                switch (choose){
                    case 1:
                        System.out.println("Enter name");
                        String name = addName();
                        employee.setName(name);
                        break;
                    case 2:
                        System.out.println("Enter card ID");
                        String id = addEmployeeID();
                        employee.setEmployeeID(id);
                        break;
                    case 3:
                        System.out.println("Enter day of birth");
                        String dob = addDOB();
                        employee.setDob(dob);
                        break;
                    case 4:
                        System.out.println("Enter gender");
                        String gender = addGender();
                        employee.setGender(gender);
                        break;
                    case 5:
                        System.out.println("Enter phone number");
                        String phone = addPhoneNumber();
                        employee.setPhoneNumber(phone);
                        break;
                    case 6:
                        System.out.println("Enter email");
                        String email = addEmail();
                        employee.setEmail(email);
                        break;
                    case 7:
                        System.out.println("Enter level");
                        String level = addEmployeeLevel();
                        employee.setLevel(level);
                        break;
                    case 8:
                        System.out.println("Enter position");
                        String position = addEmployeePosition();
                        employee.setPosition(position);
                        break;
                    case 9:
                        System.out.println("Enter salary");
                        float salary = addEmployeeSalary();
                        employee.setSalary(salary);
                        break;
                    default:
                        break;
                }
            }
            while (choose != 10);
            employeeController.edit(index,employee);
        }
    }

    private void searchEmployee(){
        System.out.println("Enter name");
        String name = addName();
        List<Employee> employees = employeeController.getDetail(name);

        if(employees.size()<1){
            System.out.println("Not found name");
        }
        else {
            for(Employee employee : employees){
                System.out.println(employee);
            }
        }
    }

    private void deleteEmployee(){
        System.out.println("Enter employee ID");
        String id  = addEmployeeID();
        int index = getIndexByCustomerId(id);

        if(index == -1){
            System.out.println("The ID is not exist");
        }
        else {
            System.out.println("Do you want remove the employee" +
                    "1. Yes" +
                    "2. No");
            int choose = choose(1,2);
            if(choose == 1){
                employeeController.delete(id);
                System.out.println("The employee has been removed");
            }
        }
    }

    /*============ House ==============*/

    private String addHouseId(){
        do{
            try{
                return scanner.nextLine();
            }
            catch (Exception e){
                System.out.println("Invalid input");
            }

        }while (true);
    }

    private String addFacilityName(){
        do{
            try{
                return scanner.nextLine();
            }
            catch (Exception e){
                System.out.println("Invalid input");
            }

        }while (true);
    }

    private float addArea(){
        do{
            try{
                float area = Float.parseFloat(scanner.nextLine());
                if(area <= 0){
                    throw new NumberFormatException();
                }
                return area;
            }
            catch (NumberFormatException e){
                System.out.println("The area must be a number and greater than 0");
            }
            catch (Exception e){
                System.out.println("Invalid input");
            }
        }while (true);
    }

    private float addCost(){
        do{
            try{
                float cost = Float.parseFloat(scanner.nextLine());
                if(cost <= 0){
                    throw new NumberFormatException();
                }
                return cost;
            }
            catch (NumberFormatException e){
                System.out.println("The cost must be a number and greater than 0");
            }
            catch (Exception e){
                System.out.println("Invalid input");
            }
        }while (true);
    }

    private int addCapacity(){
        do{
            try{
                int capacity = Integer.parseInt(scanner.nextLine());
                if(capacity <= 0){
                    throw new NumberFormatException();
                }
                return capacity;
            }
            catch (NumberFormatException e){
                System.out.println("The capacity must be a integer and greater than 0");
            }
            catch (Exception e){
                System.out.println("Invalid input");
            }

        }while (true);
    }

    private String addRentalType(){
        do{
            try{
                return scanner.nextLine();
            }
            catch (Exception e){
                System.out.println("Invalid input");
            }
        }
        while (true);
    }

    private String addFreeService(){
        do{
            try{
                return scanner.nextLine();
            }
            catch (Exception e){
                System.out.println("Invalid input");
            }
        }while (true);
    }

    private String roomStandard(){
        do{
            try{
                return scanner.nextLine();
            }
            catch (Exception e){
                System.out.println("Invalid input");
            }
        }while (true);
    }

    private int addNumberFloor(){
        do{
            try{
                int floor = Integer.parseInt(scanner.nextLine());
                if(floor <= 0){
                    throw new NumberFormatException();
                }
                return floor;
            }
            catch (NumberFormatException e){
                System.out.println("The number of floor must be a integer and greater than 0");
            }
            catch (Exception e){
                System.out.println("Invalid input");
            }

        }while (true);
    }


    private void addFullHouseInfo(){
        System.out.println("Enter house ID");
        String id = addHouseId();
        System.out.println("Enter house name");
        String name = addFacilityName();
        System.out.println("Enter house area");
        float area = addArea();
        System.out.println("Enter house cost");
        float cost = addCost();
        System.out.println("Enter house capacity");
        int capacity = addCapacity();
        System.out.println("Enter house rental type");
        String type = addRentalType();
        System.out.println("Enter house room standard");
        String standard = roomStandard();
        System.out.println("Enter house number of floor");
        int floor = addNumberFloor();

        House house = new House(id, name, area, cost, capacity, type,false, standard, floor);
        houseController.add(house);
    }

    private void displayAllHouse(){
        List<House> data = houseController.getAll();
        for(House house : data){
            System.out.println(house);
        }
    }

    private void displayMaintenance(){
        List<House> data = houseController.getMaintenance();
        for(House house : data){
            System.out.println(house);
        }
    }

    private int getIndexOfHouse(String id){
        int index = -1;
        List<House> data = houseController.getMaintenance();
        for(int i=0; i<data.size(); i++){
            if(data.get(i).getId().equals(id)){
                index = i;
                return index;
            }
        }
        return index;
    }

    private void deleteHouse(){
        System.out.println("Enter house ID");
        String id = addHouseId();
        int index = getIndexByCustomerId(id);
        if(index == -1){
            System.out.println("The ID is not exist");
            return;
        }
        System.out.println("Do you want delete this house" +
                "\n1. Yes" +
                "\n2. No");
        int choose = choose(1, 2);
        if(choose == 1){
            houseController.delete(id);
            System.out.println("The house has been removed");
        }
    }
}
