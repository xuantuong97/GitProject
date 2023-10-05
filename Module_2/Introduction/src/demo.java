import java.util.*;

public class demo {
    public static int s(List<Integer> s, int k ){
        int result = 0;
        List<Integer> arr;
        boolean check;
        List<Integer> arrN = new LinkedList<>();
        int length = s.size();
        for(int i = 0; i< length; i++){

            if(arrN.size()> length-i){
                break;
            }
            if(arrN.contains(s.get(i))){
                continue;
            };
             arr = new LinkedList<>();
            arr.add(s.get(i));
            for (Integer integer : s) {
                check = true;
                for (Integer number : arr) {
                    if (integer.equals(number) || (integer % k + number % k) % k == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    arr.add(integer);
                }
            }
            arrN = arr;
            if(arr.size()>result){
                result = arr.size();
            }
        }
        return result;
    }


    public int k(List<Integer> s, int k ){
        int result = 0;
        List<Integer> data;
        boolean check;
        for(int i=0; i< s.size(); i++){
            data = new LinkedList<>();
            data.add(s.get(i));

            for(int j = i+1; j<s.size(); j++){
                for(Integer integer : data){
                    check = true;
                    if
                }
            }
        }

        return result;
    }


}
