package Array;
import java.util.Scanner;
public class SumOfColumn {
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
            System.out.println("Enter the column:");
            int indexOfColumn = scanner.nextInt();
            do {
                if (indexOfColumn >= 0 && indexOfColumn < column){
                    float sum = 0;
                    for(int i = 0; i<row; i++){
                            sum += matrix[i][indexOfColumn];
                        }
                    System.out.println("The sum of column is: "+ sum);
                    break;
                    }
                else {
                    System.out.printf("The column need to be from 0 to %d, please enter again\n", column - 1);
                    indexOfColumn = scanner.nextInt();
                }
            }
            while (true);
        }
        else {
            System.out.println("The row or column is not valid!");
        }
    }
}
