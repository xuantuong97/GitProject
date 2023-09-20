package module_2.search_algorithm.binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,8, 2, 3, 4, 5));

        System.out.println(numbers);
        Collections.sort(numbers);

        BinarySearch binarySearch = new BinarySearch();

        System.out.println(binarySearch.binary(numbers, 2));
    }
}
