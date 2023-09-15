package module_2.dsa;

import java.util.Arrays;
import  java.util.List;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(2);

        myList.add(0,3);
        myList.add(0,3);
        myList.add(0,3);
        System.out.println(Arrays.toString(myList.clone()));
        System.out.println("Size = " + myList.size());

        System.out.println("Index of 2: " + myList.indexOf(2));

        System.out.println("Is contain 4: " + myList.contains(4));

        myList.remove(1);
        System.out.println(Arrays.toString(myList.clone()));
        System.out.println("Size = " + myList.size());

        myList.clear();
        System.out.println("Size after clear: " + myList.size());


    }
}
