package module_2.string_regex.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {

    private static final String CLASS_NAME_REGEX = "^[CAP][0-9]{4}[GHIK]$";

    public ClassName(){};

    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);

        return matcher.matches();
    }
}
