package Array;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of row");
        int row = scanner.nextInt();
        System.out.println("Enter a number of column");
        int column = scanner.nextInt();
        if (row > 0 && column > 0){
            float[][] matrix = new float[row][column];
            for(int i = 0; i<row; i++){
                for(int j = 0; j<column; j++){
                    System.out.printf("Enter value of [%d][%d]\n",i,j);
                    matrix[i][j] = scanner.nextFloat();
                }
            }
            float maxNumber = matrix[0][0];
            int rowLocation = 0;
            int columnLocation = 0;
            for (int i = 0; i<row; i++){
                for (int j=0; j<column; j++){
                    if (matrix[i][j] > maxNumber){
                        maxNumber = matrix[i][j];
                        rowLocation = i;
                        columnLocation = j;
                    }
                }
            }
            System.out.println("The max number is: " + maxNumber);
            System.out.printf("The location is [%d][%d]",rowLocation, columnLocation);
        }
        else {
            System.out.println("The row or column is not valid!");
        }
    }
}
