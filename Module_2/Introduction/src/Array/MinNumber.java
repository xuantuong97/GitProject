package Array;
import java.util.Scanner;
public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        if (size > 0){
            int[] arrNumber = new int[size];
            for (int i =0; i<size; i++){
                System.out.printf("Enter value of [%d]\n",i);
                arrNumber[i] = scanner.nextInt();
            }
            int minNumber = arrNumber[0];
            for (int i = 1; i<size; i++){
                if(arrNumber[i] < minNumber){
                    minNumber = arrNumber[i];
                }
            }
            System.out.println("The min number is: " + minNumber);
        }
        else {
            System.out.println("The size of array is not valid");
        }
    }
}
