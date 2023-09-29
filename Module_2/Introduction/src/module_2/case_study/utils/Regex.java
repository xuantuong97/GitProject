package module_2.case_study.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    private static final String CUSTOMER_ID_REGEX = "^KH-[0-9]{4}$";
    private static final String NAME_REGEX = "^[A-Z][a-z]*$";
    private static final String CMND_REGEX = "^\\d{9}(\\d{3})?$";
    private static final String PHONE_NUMBER_REGEX = "^0[0-9]{9}$";
    private static final String EMPLOYEE_ID_REGEX = "^NV-[0-9]{4}$";

    public static boolean validateCustomerID(String id){
        Pattern pattern = Pattern.compile(CUSTOMER_ID_REGEX);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public static boolean validateEmployeeID(String id){
        Pattern pattern = Pattern.compile(EMPLOYEE_ID_REGEX);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    private static boolean validateName(String name){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean checkFullName(String fullName){
        for(String name: fullName.split(" ")){
            if(!validateName(name)){
                return false;
            }
        }
        return true;
    }

    public static boolean validateCMND(String id){
        Pattern pattern = Pattern.compile(CMND_REGEX);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public static boolean validatePhone(String phone){
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public static boolean validateSalary(Float salary){
        if(salary>0){
            return true;
        }
        return false;
    }
}
