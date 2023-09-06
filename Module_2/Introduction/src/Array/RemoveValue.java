package Array;
import java.util.Scanner;

public class RemoveValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter a number that you want to remove");
        int number = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < numberArr.length; i++){
            if (numberArr[i] == number){
                index = i;
                break;
            }
        }
        if (index != -1){
            for (int i = index; i < numberArr.length -1; i++){
                numberArr[i] = numberArr[i + 1];
                numberArr[i + 1] = 0;
            }
            System.out.println("The array after remove " + number);
            for (int i = 0; i< numberArr.length; i++){
                System.out.print(numberArr[i] +"\t");
            }
        }
        else {
            System.out.println(number + " is not exist in the array");
        }
    }

}
