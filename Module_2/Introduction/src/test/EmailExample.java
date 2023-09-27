package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {

    private final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public boolean validate(String regex){
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
