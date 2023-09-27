package module_2.search_algorithm.max_string;

import java.util.ArrayList;
import java.util.List;

public class MaxString {

    public MaxString(){};

    public String findMaxString(String string){

        List<String> listString = new ArrayList<>();
        String maxString;
        char maxChar;
        int indexOfMaxString = 0;
        for(int i=0; i<string.length(); i++){
            maxString ="";
            maxString +=  string.charAt(i);
            maxChar = string.charAt(i);
            for(int j = i; j<string.length() - 1; j++){
                if(maxChar < string.charAt(j+1)){
                    maxString += string.charAt(j+1);
                    maxChar = string.charAt(j+1);
                }
            }
            listString.add(maxString);
        }

        for(int i=1; i<listString.size(); i++){
            if(listString.get(i).length()> listString.get(indexOfMaxString).length()){
                indexOfMaxString = i;
            }
        }

        return listString.get(indexOfMaxString);
    }
}
// O(n^2) Complexity