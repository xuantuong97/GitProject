package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arrNumber1 = {1,2,3,4,6,7,8,0};
        int[] arrNumber2 = {10,11,23,34,12,15};
        int[] arrNumber3 = new int[arrNumber1.length + arrNumber2.length];
        for (int i = 0; i < arrNumber1.length; i++){
            arrNumber3[i] = arrNumber1[i];
        }
        for (int i = 0; i < arrNumber2.length; i++){
            arrNumber3[arrNumber1.length + i] = arrNumber2[i];
        }
        System.out.println("The array 3 is: ");
        for(int i =0; i<arrNumber3.length;i++){
            System.out.print(arrNumber3[i] + " ");
        }
    }
}
