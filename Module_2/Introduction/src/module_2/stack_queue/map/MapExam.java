package module_2.stack_queue.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExam {

    private Map<String, Integer> map = new TreeMap<>();

    MapExam(){};

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public String getWordTimes(String string){

        int count;
        string = string.toLowerCase();
        for(String str: string.split(" ")){
            if(map.containsKey(str)){
                count = map.get(str) + 1;
                map.replace(str, count);
            }
            else {
                map.put(str, 1);
            }
        }
        return map.toString();
    }
}
