package module_2.exception;

import java.util.Scanner;

public class Triangle {

    public void inputAll(){
        do{
            try{
                double a = inputSide();
                double b = inputSide();
                double c = inputSide();

                boolean isException2 = (a+b)<=c || (a+c)<=b || (b+c)<=a;
                if(isException2){
                    throw new IllegalTriangleException();
                }
                else {
                    System.out.println("The triangle have 3 side a = " + a + " b = "+b + " c = "+c);
                    break;
                }
            }
            catch (IllegalTriangleException ex){
                System.out.println(ex.getMessageOfException2());
            }
        }
        while (true);
    }

    private double inputSide(){
        do{
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter side length");
                double side = Double.parseDouble(scanner.nextLine());
                if(side<=0){
                    throw new IllegalTriangleException();
                }
                else {
                    return side;
                }
            }
            catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
            catch (IllegalTriangleException ex){
                System.out.println(ex.getMessageOfException1());
            }
        }while (true);
    }
}
