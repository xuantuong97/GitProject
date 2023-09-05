package Introduction_Java.Thuc_hanh;
import java.util.Scanner;
public class LinerResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Give a Equation as a*x + b = c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a != 0){
            double answer = (c-b)/a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }
        else {
            if (b == c){
                System.out.print("The solution is all x");
            }
            else {
                System.out.print("No solution");
            }
        }
    }
}
