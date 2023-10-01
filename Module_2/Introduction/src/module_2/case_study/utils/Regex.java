package module_2.case_study.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    private static final String CUSTOMER_ID_REGEX = "^KH-[0-9]{4}$";
    private static final String NAME_REGEX = "^[A-Z][a-z]*$";
    private static final String CMND_REGEX = "^\\d{9}(\\d{3})?$";
    private static final String PHONE_NUMBER_REGEX = "^0[0-9]{9}$";
    private static final String EMPLOYEE_ID_REGEX = "^NV-[0-9]{4}$";
    private static final String DATE_REGEX = "\\d{2}/\\d{2}/\\d{4}";

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

    public static boolean validateDate(String date){
        Pattern pattern = Pattern.compile(DATE_REGEX);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public static int calAge(String dobString){
        DateFormat stringToDate = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        Date dobDate;
        try {
            dobDate = stringToDate.parse(dobString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        DateFormat dateToString = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(dateToString.format(dobDate));
        int d2 = Integer.parseInt(dateToString.format(currentDate));
        return (d2-d1)/10000;
    }
    
    public static boolean checkValidDate(String date){
        String day = date.substring(0, 2);
        String month = date.substring(3, 5);
        int dayInt = Integer.parseInt(day);
        int monthInt = Integer.parseInt(month);

        if (dayInt < 1 || dayInt >31){
            return false;
        }
        if(monthInt <1 || monthInt >12){
            return false;
        }
        boolean is30Day = monthInt == 4 || monthInt == 6 || monthInt == 9 || monthInt == 11;
        if(is30Day && dayInt == 31){
            return false;
        }
        if(monthInt == 2 && dayInt > 29){
            return false;
        }
        return true;
    }
}
