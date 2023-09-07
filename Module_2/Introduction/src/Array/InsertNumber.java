package Array;
import java.util.Scanner;

public class InsertNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrNumber = {1,2,3,4,5,6,0,0,0,0};
        System.out.println("Enter the number you want to insert");
        int number = scanner.nextInt();
        System.out.println("Enter the location");
        int location = scanner.nextInt();
        if (location >= 0 && location < arrNumber.length){
            arrNumber[arrNumber.length - 1] = number;
            for (int i = arrNumber.length - 1; i > location; i--){
                int temp = arrNumber[i];
                arrNumber[i] = arrNumber[i-1];
                arrNumber[i-1] = temp;
            }
            System.out.println("The array after insert "+ number);
            for (int i = 0; i<arrNumber.length; i++){
                System.out.print(arrNumber[i] + "\t");
            }
        }
        else {
            System.out.println("The location is out of range");
        }
    }
}
