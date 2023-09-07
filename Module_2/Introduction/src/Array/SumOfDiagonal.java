package Array;
import java.util.Scanner;
public class SumOfDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of square matrix");
        int size = scanner.nextInt();
        if (size > 0){
            float[][] squareMatrix = new float[size][size];
            float sum = 0;
            for(int i = 0; i<size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.printf("Enter value of [%d][%d]\n", i, j);
                    squareMatrix[i][j] = scanner.nextFloat();
                    if(i == j){
                        sum += squareMatrix[i][j];
                    }
                }
            }
            System.out.println("The sum of diagonal line is: " + sum);
        }
        else {
            System.out.println("The size of matrix is not valid");
        }
    }
}
