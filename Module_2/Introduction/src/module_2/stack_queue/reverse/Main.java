package module_2.stack_queue.reverse;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Reverse reverse = new Reverse();

        int[] arrNumber = new int[]{1,2,3,4,5};

        System.out.println("Reverse Array: " + Arrays.toString(reverse.reverseNumberArray(arrNumber)));

        String str = "abcdefgh";

        System.out.println("Reverse String: " + reverse.reverseString(str));
    }
}
