package module_2.search_algorithm.binary_search;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

    public BinarySearch(){};

    private int search(ArrayList<Integer> integerArrayList, int left, int right, Integer value){

        int mid = (left + right)/2;

        if(left > right){
            return -1;
        }
        if(integerArrayList.get(mid) == value){
            return mid;
        }
        else if(integerArrayList.get(mid) > value){
            right = mid - 1;
            return search(integerArrayList, left, right, value);
        }
        else {
            left = mid + 1;
            return search(integerArrayList, left, right, value);
        }
    }

    public int binary(ArrayList<Integer> integerArrayList, Integer value){
        Collections.sort(integerArrayList);
        return
        search(integerArrayList, 0, integerArrayList.size() - 1, value);
    }
}
