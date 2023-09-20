package module_2.search_algorithm.max_string;

import java.util.ArrayList;

public class MaxString {

    public MaxString() {};


    public String maxString(String string) {

        String[] arrString = string.split("");
        String outString = arrString[0];
        String minChar = arrString[0];
        for (int i = 1; i < arrString.length; i++) {
            if (arrString[i].compareTo(minChar) > 0) {
                outString += arrString[i];
                minChar = arrString[i];
            }
        }
        return outString;
    }
}
