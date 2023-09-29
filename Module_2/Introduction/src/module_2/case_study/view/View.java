package module_2.case_study.view;


import module_2.case_study.controller.CustomerController;
import module_2.case_study.model.Customer;
import module_2.case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class View {
    private final CustomerController customerController = new CustomerController();
    private final Scanner scanner = new Scanner(System.in);

    public void mainMenu(){
        int choose;
        do {
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
                case 6:
                    break;
            }
        }
        while (choose != 6);

    }

    private void customerMenu(){
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tDelete customer\n" +
                "5.\tSearch by name customer\n" +
                "6.\tReturn main menu\n");
        int choose = choose(1, 6);
        switch (choose){
            case 1: displayAllCustomer();
            break;
            case 2: addFullInformationOfCus();
            break;
            case 3: editCustomerInfo();
            break;
            case 4: deleteCustomer();
            break;
        }
    }

    private void employeeMenu(){
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tDelete employee\n" +
                "5\tSearch by name employee\n" +
                "6\tReturn main menu\n");
    }

    private void facilityMenu(){
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tDelete facility\n" +
                "5\tReturn main menu\n");
    }

    private void bookingMenu(){
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new contracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");
    }

    private void promotionMenu(){
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
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
                System.out.println("Invalid input");
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
        String customerName = addCustomerName();
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


    private  String addCustomerID(){
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

    private String addCustomerName(){
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
                return scanner.nextLine();
            }catch (Exception e){
                System.out.println("The input is not valid");
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
                        String customerName = addCustomerName();
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
        String name = addCustomerName();
        List<Customer> customers = customerController.getDetail(name);
        
    }
}
