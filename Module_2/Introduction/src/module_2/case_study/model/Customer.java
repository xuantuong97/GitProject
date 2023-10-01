package module_2.case_study.model;

public class Customer extends AbstractPerson{

    private String customerID;
    private String type;
    private String address;

    public Customer(){};

    public Customer(String customerID, String type, String address) {
        this.customerID = customerID;
        this.type = type;
        this.address = address;
    }

    public Customer(String customerID, String name, String id, String dob, String gender, String phoneNumber, String email, String type, String address) {
        super(name, id, dob, gender, phoneNumber, email);
        this.customerID = customerID;
        this.type = type;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + getName() + '\'' +
                ", id='" + getId() + '\'' +
                ", dob='" + getDob() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
