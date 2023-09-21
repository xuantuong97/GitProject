package module_2.sort.insert_sort;

import java.util.Arrays;

public class InsertSort {

    public static void sort(int[] arrNumber){
        int j;
        int temp;

        System.out.println("The array before sort " + Arrays.toString(arrNumber));
        for(int i=1; i<arrNumber.length; i++){
            j = i;
            temp = arrNumber[i];
            System.out.println("The loop "+ i);

            while (j > 0 && temp < arrNumber[j-1]){
                arrNumber[j] = arrNumber[j-1];
                System.out.println(Arrays.toString(arrNumber));
                j--;
            }
            arrNumber[j] = temp;
            System.out.println("Change value at index "+ j + " to " + temp );
            System.out.println("After the loop " + i);
            System.out.println("The result "+ Arrays.toString(arrNumber) +'\n');
        }
        System.out.println("The array after sort " + Arrays.toString(arrNumber));
    }
}
