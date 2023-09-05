package thuc_hanh;
import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student:");
        String inputName = scanner.nextLine();
        String[] students = {"Chris", "Michael","Camila","Tara"};

        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(inputName)){
                System.out.println("Position of the students in the list " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found " + inputName + " in the list");
        }
    }
}
