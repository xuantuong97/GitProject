package Introduction_Java.Bai_tap;
import java.util.Scanner;
public class SayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
