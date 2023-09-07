package Array;
import java.util.Scanner;
public class MergerTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array 1");
        int length1 = scanner.nextInt();
        int[] arrNumber1 = new int[length1];
        System.out.println("Enter the length of array 2");
        int length2 = scanner.nextInt();
        int[] arrNumber2 = new int[length2];
        int[] arrNumber3 = new int[arrNumber1.length + arrNumber2.length];
        System.out.println("Enter value for array 1");
        for (int i = 0; i < arrNumber1.length; i++){
            System.out.printf("Value of [%d]",i);
            arrNumber1[i] = scanner.nextInt();
            arrNumber3[i] = arrNumber1[i];
        }
        System.out.println("Enter value for array 2");
        for (int i = 0; i < arrNumber2.length; i++){
            System.out.printf("Value of [%d]",i);
            arrNumber2[i] = scanner.nextInt();
            arrNumber3[arrNumber1.length + i] = arrNumber2[i];
        }
        System.out.println("The array 3 is: ");
        for(int i =0; i<arrNumber3.length;i++){
            System.out.print(arrNumber3[i] + " ");
        }
    }
}
