package Array;
import java.util.Scanner;

public class RemoveValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArrOld = {1, 2, 2, 0, 0, 3, 4, 5, 6, 7, 8, 9};
        int[] numberArrNew = new int[numberArrOld.length];
        System.out.println("Enter a number that you want to remove");
        int number = scanner.nextInt();
        boolean isExist = false;
        for (int i = 0; i < numberArrOld.length; i++) {
            if (numberArrOld[i] == number) {
                isExist = true;
                break;
            }
        }
        if (isExist) {
            int indexOfArrNew = 0;
            for (int i = 0; i < numberArrOld.length; i++) {
                if (numberArrOld[i] == number) {
                    continue;
                }
                numberArrNew[indexOfArrNew] = numberArrOld[i];
                indexOfArrNew ++;
            }
            System.out.println("The array after remove "+ number);
            for (int i=0; i < numberArrNew.length; i++){
                System.out.print(numberArrNew[i] + "\t");
            }
        }
        else {
            System.out.println("The number is not exist the array");
        }
    }
}

