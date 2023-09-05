package Introduction_Java.Thuc_hanh;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class CaculatorBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Enter your weight (in kilogram)");
        weight = scanner.nextDouble();
        System.out.println("Enter your height (in meter)");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);

        if (bmi < 18){
            System.out.println("Under weight");
        }
        else if (bmi < 25){
            System.out.println("Normal");
        }
        else if (bmi < 30){
            System.out.println("Over weight");
        }
        else {
            System.out.println("Obese");
        }
    }

}
